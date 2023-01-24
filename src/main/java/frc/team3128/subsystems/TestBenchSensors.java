package frc.team3128.subsystems;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class TestBenchSensors extends SubsystemBase {
    private static TestBenchSensors instance = new TestBenchSensors();
    private DigitalInput m_sensorLeft = new DigitalInput(0), m_sensorRight = new DigitalInput(2);

    public static synchronized TestBenchSensors getInstance() {
        return instance;
    }

    public boolean getSensorLeft() {
        return m_sensorLeft.get();
    }

    public boolean getSensorRight() {
        return m_sensorRight.get();
    }

    public String getGamePiece() {
        if (!getSensorLeft() && !getSensorRight()) return "CUBE";
        if (!getSensorLeft() && getSensorRight()) return "CONE_RIGHT";
        if (getSensorLeft() && !getSensorRight()) return "CONE_LEFT";
        return "NONE";
    }
}
