package net.jaggerwang.sbip.adapter.dao.jpa.entity;

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
import static net.jaggerwang.sbip.adapter.dao.jpa.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;

public class Post_PostBuilder_build_8557785189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26665;

    public Post_PostBuilder_build_8557785189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term26666 = new Long(-7787918913179897745L);
        Long term26668 = new Long(9173715346996433126L);
        Class<? extends Object> term26733 = Class.forName((String) "net.jaggerwang.sbip.entity.PostBO$Type");
        Field term26732 = ((Class) term26733).getDeclaredField((String) "TEXT");
        ((Field) term26732).setAccessible(true);
        Object enum68 = ((Field) term26732).get((Object) null);
        Long term26692 = new Long(-3243599172737171562L);
        Long term26694 = new Long(3221586604131689186L);
        Long term26696 = new Long(-1283936527800858962L);
        Long term26698 = new Long(-8901189796092679153L);
        Long term26700 = new Long(1731335447688885587L);
        Long term26702 = new Long(-6206610574921547811L);
        Long term26704 = new Long(-1625372334693179543L);
        Long term26706 = new Long(3778691000276335279L);
        ArrayList term26690 = new ArrayList();
        ((ArrayList) term26690).add(term26692);
        ((ArrayList) term26690).add(term26694);
        ((ArrayList) term26690).add(term26696);
        ((ArrayList) term26690).add(term26698);
        ((ArrayList) term26690).add(term26700);
        ((ArrayList) term26690).add(term26702);
        ((ArrayList) term26690).add(term26704);
        ((ArrayList) term26690).add(term26706);
        Long term26710 = new Long(8453730687540121475L);
        term26665 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.Post$PostBuilder"));
        Object term26712 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term26713 = newInstance(Class.forName("java.time.LocalDate"));
        Object term26717 = newInstance(Class.forName("java.time.LocalTime"));
        Object term26722 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term26723 = newInstance(Class.forName("java.time.LocalDate"));
        Object term26727 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term26665, term26665.getClass(), "id", term26666);
        setField(term26665, term26665.getClass(), "userId", term26668);
        setField(term26665, term26665.getClass(), "type", enum68);
        setField(term26665, term26665.getClass(), "text", "pvDEABOxLt");
        setField(term26665, term26665.getClass(), "imageIds", term26690);
        setField(term26665, term26665.getClass(), "videoId", term26710);
        setIntField(term26713, term26713.getClass(), "year", 2026);
        setShortField(term26713, term26713.getClass(), "month", (short) 2);
        setShortField(term26713, term26713.getClass(), "day", (short) 26);
        setField(term26712, term26712.getClass(), "date", term26713);
        setByteField(term26717, term26717.getClass(), "hour", (byte) 12);
        setByteField(term26717, term26717.getClass(), "minute", (byte) 23);
        setByteField(term26717, term26717.getClass(), "second", (byte) 14);
        setIntField(term26717, term26717.getClass(), "nano", 86303611);
        setField(term26712, term26712.getClass(), "time", term26717);
        setField(term26665, term26665.getClass(), "createdAt", term26712);
        setIntField(term26723, term26723.getClass(), "year", 2014);
        setShortField(term26723, term26723.getClass(), "month", (short) 6);
        setShortField(term26723, term26723.getClass(), "day", (short) 12);
        setField(term26722, term26722.getClass(), "date", term26723);
        setByteField(term26727, term26727.getClass(), "hour", (byte) 5);
        setByteField(term26727, term26727.getClass(), "minute", (byte) 4);
        setByteField(term26727, term26727.getClass(), "second", (byte) 20);
        setIntField(term26727, term26727.getClass(), "nano", 169602296);
        setField(term26722, term26722.getClass(), "time", term26727);
        setField(term26665, term26665.getClass(), "updatedAt", term26722);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.Post$PostBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term26665, args);
    }

};


