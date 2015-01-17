package org.team2839.robot2015;

import edu.wpi.first.wpilibj.Encoder;

public class PositionalQuadEncoder extends Encoder {
	
	private double ticksPerRevolution;

	public PositionalQuadEncoder(int aChannel, int bChannel,
			boolean reverseDirection, EncodingType encodingType) {
		super(aChannel, bChannel, reverseDirection, encodingType);
		
		setDistancePerPulse(1.0);
	}
	
	@Override
	public double pidGet() {
		return getDistance() % ticksPerRevolution;
	}

	public double getTicksPerRevolution() {
		return ticksPerRevolution;
	}

	public void setTicksPerRevolution(double ticksPerRevolution) {
		this.ticksPerRevolution = ticksPerRevolution;
	}

}
