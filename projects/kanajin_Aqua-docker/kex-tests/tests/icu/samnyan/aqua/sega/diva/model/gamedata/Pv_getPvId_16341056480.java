package icu.samnyan.aqua.sega.diva.model.gamedata;

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
import static icu.samnyan.aqua.sega.diva.model.gamedata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.HashMap;

public class Pv_getPvId_16341056480 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public Pv_getPvId_16341056480() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2 = new Integer(568599855);
        Integer term4 = new Integer(1162663216);
        Integer term78 = new Integer(1484323161);
        HashMap term80 = new HashMap();
        term1 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Pv"));
        setField(term1, term1.getClass(), "pvId", term2);
        setField(term1, term1.getClass(), "bpm", term4);
        setField(term1, term1.getClass(), "songName", "PAEBtnZtTD");
        setField(term1, term1.getClass(), "songNameEng", "sjlJAEtRrb");
        setField(term1, term1.getClass(), "songNameReading", "MuLcgQHgqz");
        setField(term1, term1.getClass(), "arranger", "xxtlPwDYFs");
        setField(term1, term1.getClass(), "lyrics", "jJCZpVmanW");
        setField(term1, term1.getClass(), "music", "EGtDIRbSSb");
        setField(term1, term1.getClass(), "performerNumber", term78);
        setField(term1, term1.getClass(), "difficulty", term80);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Pv");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPvId", argTypes, term1, args);
    }

};


