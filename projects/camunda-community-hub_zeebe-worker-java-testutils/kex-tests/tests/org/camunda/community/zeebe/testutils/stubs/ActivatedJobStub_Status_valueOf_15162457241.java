package org.camunda.community.zeebe.testutils.stubs;

import static org.camunda.community.zeebe.testutils.stubs.ReflectionUtils.*;

import java.util.concurrent.TimeUnit;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ActivatedJobStub_Status_valueOf_15162457241 {
  @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);

  public ActivatedJobStub_Status_valueOf_15162457241() {}

  public <T> T unknown() {
    throw new IllegalStateException();
  }

  @Before
  public void setup() throws Throwable {}

  @Test
  public void test() throws Throwable, Throwable {
    Class<?> klass =
        Class.forName("org.camunda.community.zeebe.testutils.stubs.ActivatedJobStub$Status");
    Class<?>[] argTypes = new Class<?>[1];
    argTypes[0] = Class.forName("java.lang.String");
    Object[] args = new Object[1];
    args[0] = "PAEBtnZtTD";
    callMethod(klass, "valueOf", argTypes, null, args);
  }
}
;
