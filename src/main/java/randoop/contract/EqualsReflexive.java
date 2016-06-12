package randoop.contract;

import randoop.Globals;

/**
 * The contract: <code>x0.equals(x0)==true</code>.
 */
public final class EqualsReflexive implements ObjectContract {
  private static final EqualsReflexive instance = new EqualsReflexive();

  private EqualsReflexive() {};

  public static EqualsReflexive getInstance() {
    return instance;
  }

  @Override
  public boolean evaluate(Object... objects) {
    assert objects != null && objects.length == 1;
    Object o = objects[0];
    assert o != null;
    return o.equals(o);
  }

  @Override
  public int getArity() {
    return 1;
  }

  @Override
  public String toCommentString() {
    return "x0.equals(x0)";
  }

  @Override
  public String get_observer_str() {
    return "EqualsReflexive";
  }

  @Override
  public boolean evalExceptionMeansFailure() {
    return true;
  }

  @Override
  public String toCodeString() {
    StringBuilder b = new StringBuilder();
    b.append(Globals.lineSep);
    b.append("// Checks the contract: ");
    b.append(" " + toCommentString() + Globals.lineSep);
    b.append("org.junit.Assert.assertTrue(");
    b.append("\"Contract failed: " + toCommentString() + "\", ");
    b.append("x0.equals(x0)");
    b.append(");");
    return b.toString();
  }
}
