package org.team2839.robot2015;

import edu.wpi.first.wpilibj.Encoder;

public class PositionalQuadEncoder extends Encoder {

	private double pulsesPerRevolution;

	public PositionalQuadEncoder(int aChannel, int bChannel,
			boolean reverseDirection, EncodingType encodingType) {
		super(aChannel, bChannel, reverseDirection, encodingType);

		setDistancePerPulse(1.0);
	}

	@Override
	public double pidGet() {
		return getDistance() % pulsesPerRevolution;
	}

	public double getTicksPerRevolution() {
		return pulsesPerRevolution;
	}

	public void setPulsesPerRevolution(double ticksPerRevolution) {
		this.pulsesPerRevolution = ticksPerRevolution;
	}

}
