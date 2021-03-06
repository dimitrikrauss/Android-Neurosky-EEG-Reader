package idlework.eegreader.generics.contracts;

public interface GenericActivitySignalContract {
  void setMessageFromDevice(String string);

  void setSignalLevel(int level);

  void setAttentionLevel(int level);

  void setMeditationLevel(int level);

  void setBlinkLevel(int level);

  void setRawData(int level);

  void setDelta(int level);

  void setTheta(int level);

  void setLowAlpha(int level);

  void setHighAlpha(int level);

  void setLowBeta(int level);

  void setHighBeta(int level);

  void setLowGamma(int level);

  void setMidGamma(int level);
}
