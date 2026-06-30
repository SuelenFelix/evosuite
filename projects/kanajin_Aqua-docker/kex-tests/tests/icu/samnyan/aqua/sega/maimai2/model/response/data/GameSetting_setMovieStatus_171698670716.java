package icu.samnyan.aqua.sega.maimai2.model.response.data;

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
import static icu.samnyan.aqua.sega.maimai2.model.response.data.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class GameSetting_setMovieStatus_171698670716 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4296;
     Object term4374;

    public GameSetting_setMovieStatus_171698670716() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4296 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.data.GameSetting"));
        setBooleanField(term4296, term4296.getClass(), "isMaintenance", true);
        setIntField(term4296, term4296.getClass(), "requestInterval", 1357632911);
        setField(term4296, term4296.getClass(), "rebootStartTime", "TiUqHrjoEU");
        setField(term4296, term4296.getClass(), "rebootEndTime", "eoEvZbdLjL");
        setIntField(term4296, term4296.getClass(), "movieUploadLimit", 1768195761);
        setIntField(term4296, term4296.getClass(), "movieStatus", -1382661134);
        setField(term4296, term4296.getClass(), "movieServerUri", "BkIxsyPkGy");
        setField(term4296, term4296.getClass(), "deliverServerUri", "mrMGwoRgVY");
        setField(term4296, term4296.getClass(), "oldServerUri", "mxVLTgCwki");
        setField(term4296, term4296.getClass(), "usbDlServerUri", "wCurppnDSA");
        setIntField(term4296, term4296.getClass(), "rebootInterval", -1042022818);
        term4374 = new Integer(317372051);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4374;
        callMethod(klass, "setMovieStatus", argTypes, term4296, args);
    }

};


