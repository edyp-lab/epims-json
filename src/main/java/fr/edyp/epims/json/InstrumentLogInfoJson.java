package fr.edyp.epims.json;

public class InstrumentLogInfoJson implements java.io.Serializable {
  String instrumentName;
  String logData;

  public String getInstrumentName() {
    return instrumentName;
  }

  public void setInstrumentName(String instrumentName) {
    this.instrumentName = instrumentName;
  }

  public String getLogData() {
    return logData;
  }

  public void setLogData(String logData) {
    this.logData = logData;
  }
}
