package icu.samnyan.aqua.api.model.resp.sega.chuni.v1;

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
import static icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class ProfileResp_setCharacterId_85761482432 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2717;
     Object term2780;

    public ProfileResp_setCharacterId_85761482432() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2717 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ProfileResp"));
        Object term2759 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2760 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2764 = newInstance(Class.forName("java.time.LocalTime"));
        Object term2769 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2770 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2774 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term2717, term2717.getClass(), "userName", "kBdSllIBVz");
        setIntField(term2717, term2717.getClass(), "level", -18216811);
        setField(term2717, term2717.getClass(), "exp", "TJmVBGfTML");
        setLongField(term2717, term2717.getClass(), "point", -8019730974733786399L);
        setLongField(term2717, term2717.getClass(), "totalPoint", 394960377236392159L);
        setIntField(term2717, term2717.getClass(), "playCount", -1813280137);
        setIntField(term2717, term2717.getClass(), "playerRating", 719656595);
        setIntField(term2717, term2717.getClass(), "highestRating", -1516995753);
        setIntField(term2717, term2717.getClass(), "nameplateId", -390501023);
        setIntField(term2717, term2717.getClass(), "frameId", -1667482829);
        setIntField(term2717, term2717.getClass(), "characterId", 1116576792);
        setIntField(term2717, term2717.getClass(), "trophyId", -942194446);
        setIntField(term2717, term2717.getClass(), "totalMapNum", -938508470);
        setLongField(term2717, term2717.getClass(), "totalHiScore", -2955854401507097864L);
        setLongField(term2717, term2717.getClass(), "totalBasicHighScore", 329213208496958131L);
        setLongField(term2717, term2717.getClass(), "totalAdvancedHighScore", 8107921244631636572L);
        setLongField(term2717, term2717.getClass(), "totalExpertHighScore", -7904053112604879960L);
        setLongField(term2717, term2717.getClass(), "totalMasterHighScore", -6602460430714339690L);
        setIntField(term2717, term2717.getClass(), "friendCount", 1242676024);
        setIntField(term2760, term2760.getClass(), "year", 2028);
        setShortField(term2760, term2760.getClass(), "month", (short) 1);
        setShortField(term2760, term2760.getClass(), "day", (short) 18);
        setField(term2759, term2759.getClass(), "date", term2760);
        setByteField(term2764, term2764.getClass(), "hour", (byte) 12);
        setByteField(term2764, term2764.getClass(), "minute", (byte) 4);
        setByteField(term2764, term2764.getClass(), "second", (byte) 39);
        setIntField(term2764, term2764.getClass(), "nano", 651287093);
        setField(term2759, term2759.getClass(), "time", term2764);
        setField(term2717, term2717.getClass(), "firstPlayDate", term2759);
        setIntField(term2770, term2770.getClass(), "year", 2027);
        setShortField(term2770, term2770.getClass(), "month", (short) 7);
        setShortField(term2770, term2770.getClass(), "day", (short) 23);
        setField(term2769, term2769.getClass(), "date", term2770);
        setByteField(term2774, term2774.getClass(), "hour", (byte) 12);
        setByteField(term2774, term2774.getClass(), "minute", (byte) 6);
        setByteField(term2774, term2774.getClass(), "second", (byte) 19);
        setIntField(term2774, term2774.getClass(), "nano", 8025683);
        setField(term2769, term2769.getClass(), "time", term2774);
        setField(term2717, term2717.getClass(), "lastPlayDate", term2769);
        setIntField(term2717, term2717.getClass(), "courseClass", -1865023308);
        term2780 = new Integer(1698510819);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2780;
        callMethod(klass, "setCharacterId", argTypes, term2717, args);
    }

};


