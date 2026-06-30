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
import java.lang.Object;
import java.lang.Integer;
import java.util.HashMap;

public class Difficulty_hashCode_8416410714 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7127;

    public Difficulty_hashCode_8416410714() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term7130 = new Integer(-485108462);
        Integer term7132 = new Integer(1418551216);
        Integer term7206 = new Integer(-626779272);
        HashMap term7208 = new HashMap();
        term7127 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Difficulty"));
        Object term7129 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Pv"));
        setLongField(term7127, term7127.getClass(), "id", -4714000263923324167L);
        setField(term7129, term7129.getClass(), "pvId", term7130);
        setField(term7129, term7129.getClass(), "bpm", term7132);
        setField(term7129, term7129.getClass(), "songName", "PBcepqkBBV");
        setField(term7129, term7129.getClass(), "songNameEng", "mukHRKZmND");
        setField(term7129, term7129.getClass(), "songNameReading", "WVPSokrFPV");
        setField(term7129, term7129.getClass(), "arranger", "jELmrpQCNf");
        setField(term7129, term7129.getClass(), "lyrics", "NkjAcBXmmT");
        setField(term7129, term7129.getClass(), "music", "KgtGJGInhu");
        setField(term7129, term7129.getClass(), "performerNumber", term7206);
        setField(term7129, term7129.getClass(), "difficulty", term7208);
        setField(term7127, term7127.getClass(), "pv", term7129);
        setIntField(term7127, term7127.getClass(), "edition", -20614472);
        setField(term7127, term7127.getClass(), "level", "RbXhBDZbRT");
        setIntField(term7127, term7127.getClass(), "version", 1126618861);
        setField(term7127, term7127.getClass(), "diff", "QDaTqkWnGj");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Difficulty");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term7127, args);
    }

};


