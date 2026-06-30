package kyungseo.poc.simple.web.security.persistence.entity.ds1;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static kyungseo.poc.simple.web.security.persistence.entity.ds1.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Integer;

public class Role_getUsers_8190955566 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32619;

    public Role_getUsers_8190955566() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term32620 = new Long(8715204132761098696L);
        Long term32625 = new Long(-7560086943976921411L);
        Boolean term32630 = new Boolean(true);
        Integer term32632 = new Integer(1904515443);
        ArrayList term32637 = new ArrayList();
        ((ArrayList) term32637).add((Object)null);
        Object term32624 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.User"));
        Object term32642 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term32643 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term32624, term32624.getClass(), "id", term32625);
        setField(term32624, term32624.getClass(), "membername", "");
        setField(term32624, term32624.getClass(), "email", "");
        setField(term32624, term32624.getClass(), "password", "");
        setField(term32624, term32624.getClass(), "enabled", term32630);
        setField(term32624, term32624.getClass(), "age", term32632);
        setField(term32624, term32624.getClass(), "phoneNumber", "");
        setField(term32624, term32624.getClass(), "country", "");
        setField(term32624, term32624.getClass(), "birthdate", "");
        setField(term32624, term32624.getClass(), "roles", term32637);
        setBooleanField(term32624, term32624.getClass(), "isUsing2FA", false);
        setField(term32624, term32624.getClass(), "secret", "");
        setField(term32642, term32642.getClass(), "date", null);
        setField(term32642, term32642.getClass(), "time", null);
        setField(term32624, term32624.getClass(), "regDate", term32642);
        setField(term32643, term32643.getClass(), "date", null);
        setField(term32643, term32643.getClass(), "time", null);
        setField(term32624, term32624.getClass(), "modDate", term32643);
        Long term32645 = new Long(-8289034985880178543L);
        Boolean term32650 = new Boolean(false);
        Integer term32652 = new Integer(588390599);
        ArrayList term32657 = new ArrayList();
        ((ArrayList) term32657).add((Object)null);
        ((ArrayList) term32657).add((Object)null);
        ((ArrayList) term32657).add((Object)null);
        ((ArrayList) term32657).add((Object)null);
        ((ArrayList) term32657).add((Object)null);
        ((ArrayList) term32657).add((Object)null);
        Object term32644 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.User"));
        Object term32662 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term32663 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term32644, term32644.getClass(), "id", term32645);
        setField(term32644, term32644.getClass(), "membername", "");
        setField(term32644, term32644.getClass(), "email", "");
        setField(term32644, term32644.getClass(), "password", "");
        setField(term32644, term32644.getClass(), "enabled", term32650);
        setField(term32644, term32644.getClass(), "age", term32652);
        setField(term32644, term32644.getClass(), "phoneNumber", "");
        setField(term32644, term32644.getClass(), "country", "");
        setField(term32644, term32644.getClass(), "birthdate", "");
        setField(term32644, term32644.getClass(), "roles", term32657);
        setBooleanField(term32644, term32644.getClass(), "isUsing2FA", false);
        setField(term32644, term32644.getClass(), "secret", "");
        setField(term32662, term32662.getClass(), "date", null);
        setField(term32662, term32662.getClass(), "time", null);
        setField(term32644, term32644.getClass(), "regDate", term32662);
        setField(term32663, term32663.getClass(), "date", null);
        setField(term32663, term32663.getClass(), "time", null);
        setField(term32644, term32644.getClass(), "modDate", term32663);
        Long term32665 = new Long(4078914953725326519L);
        Boolean term32670 = new Boolean(false);
        Integer term32672 = new Integer(1728588701);
        ArrayList term32677 = new ArrayList();
        Object term32664 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.User"));
        Object term32682 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term32683 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term32664, term32664.getClass(), "id", term32665);
        setField(term32664, term32664.getClass(), "membername", "");
        setField(term32664, term32664.getClass(), "email", "");
        setField(term32664, term32664.getClass(), "password", "");
        setField(term32664, term32664.getClass(), "enabled", term32670);
        setField(term32664, term32664.getClass(), "age", term32672);
        setField(term32664, term32664.getClass(), "phoneNumber", "");
        setField(term32664, term32664.getClass(), "country", "");
        setField(term32664, term32664.getClass(), "birthdate", "");
        setField(term32664, term32664.getClass(), "roles", term32677);
        setBooleanField(term32664, term32664.getClass(), "isUsing2FA", false);
        setField(term32664, term32664.getClass(), "secret", "");
        setField(term32682, term32682.getClass(), "date", null);
        setField(term32682, term32682.getClass(), "time", null);
        setField(term32664, term32664.getClass(), "regDate", term32682);
        setField(term32683, term32683.getClass(), "date", null);
        setField(term32683, term32683.getClass(), "time", null);
        setField(term32664, term32664.getClass(), "modDate", term32683);
        ArrayList term32622 = new ArrayList();
        ((ArrayList) term32622).add(term32624);
        ((ArrayList) term32622).add(term32644);
        ((ArrayList) term32622).add(term32664);
        Long term32689 = new Long(221832985952382123L);
        ArrayList term32692 = new ArrayList();
        ((ArrayList) term32692).add((Object)null);
        ((ArrayList) term32692).add((Object)null);
        ((ArrayList) term32692).add((Object)null);
        ((ArrayList) term32692).add((Object)null);
        ((ArrayList) term32692).add((Object)null);
        ((ArrayList) term32692).add((Object)null);
        ((ArrayList) term32692).add((Object)null);
        ((ArrayList) term32692).add((Object)null);
        Object term32688 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Privilege"));
        setField(term32688, term32688.getClass(), "id", term32689);
        setField(term32688, term32688.getClass(), "name", "");
        setField(term32688, term32688.getClass(), "roles", term32692);
        Long term32696 = new Long(-6281514459098412431L);
        ArrayList term32699 = new ArrayList();
        Object term32695 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Privilege"));
        setField(term32695, term32695.getClass(), "id", term32696);
        setField(term32695, term32695.getClass(), "name", "");
        setField(term32695, term32695.getClass(), "roles", term32699);
        ArrayList term32686 = new ArrayList();
        ((ArrayList) term32686).add(term32688);
        ((ArrayList) term32686).add(term32695);
        term32619 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role"));
        setField(term32619, term32619.getClass(), "id", term32620);
        setField(term32619, term32619.getClass(), "users", term32622);
        setField(term32619, term32619.getClass(), "privileges", term32686);
        setField(term32619, term32619.getClass(), "name", "IdEEUvapZX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.Role");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUsers", argTypes, term32619, args);
    }

};


