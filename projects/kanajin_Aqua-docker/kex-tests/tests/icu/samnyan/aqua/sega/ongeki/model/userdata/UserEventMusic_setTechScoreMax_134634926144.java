package icu.samnyan.aqua.sega.ongeki.model.userdata;

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
import static icu.samnyan.aqua.sega.ongeki.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class UserEventMusic_setTechScoreMax_134634926144 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term381452;
     Object term381461;

    public UserEventMusic_setTechScoreMax_134634926144() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term381452 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserEventMusic"));
        setLongField(term381452, term381452.getClass(), "id", 0L);
        setField(term381452, term381452.getClass(), "user", null);
        setIntField(term381452, term381452.getClass(), "eventId", 0);
        setIntField(term381452, term381452.getClass(), "type", 0);
        setIntField(term381452, term381452.getClass(), "musicId", 0);
        setIntField(term381452, term381452.getClass(), "level", 0);
        setIntField(term381452, term381452.getClass(), "techScoreMax", 0);
        setIntField(term381452, term381452.getClass(), "platinumScoreMax", 0);
        setField(term381452, term381452.getClass(), "techRecordDate", null);
        setBooleanField(term381452, term381452.getClass(), "isTechNewRecord", false);
        term381461 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserEventMusic");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term381461;
        callMethod(klass, "setTechScoreMax", argTypes, term381452, args);
    }

};


