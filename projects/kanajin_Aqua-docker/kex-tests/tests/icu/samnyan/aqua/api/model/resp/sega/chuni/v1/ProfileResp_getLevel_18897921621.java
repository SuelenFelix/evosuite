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

public class ProfileResp_getLevel_18897921621 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84;

    public ProfileResp_getLevel_18897921621() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term84 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ProfileResp"));
        Object term126 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term127 = newInstance(Class.forName("java.time.LocalDate"));
        Object term131 = newInstance(Class.forName("java.time.LocalTime"));
        Object term136 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term137 = newInstance(Class.forName("java.time.LocalDate"));
        Object term141 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term84, term84.getClass(), "userName", "MuLcgQHgqz");
        setIntField(term84, term84.getClass(), "level", -522618178);
        setField(term84, term84.getClass(), "exp", "xxtlPwDYFs");
        setLongField(term84, term84.getClass(), "point", 6811161968424632369L);
        setLongField(term84, term84.getClass(), "totalPoint", -7237588299778557629L);
        setIntField(term84, term84.getClass(), "playCount", 1134449235);
        setIntField(term84, term84.getClass(), "playerRating", -883034806);
        setIntField(term84, term84.getClass(), "highestRating", 1585847225);
        setIntField(term84, term84.getClass(), "nameplateId", 597278769);
        setIntField(term84, term84.getClass(), "frameId", -1685132342);
        setIntField(term84, term84.getClass(), "characterId", -1456670397);
        setIntField(term84, term84.getClass(), "trophyId", 1622346318);
        setIntField(term84, term84.getClass(), "totalMapNum", 1048535127);
        setLongField(term84, term84.getClass(), "totalHiScore", 6967924379644551255L);
        setLongField(term84, term84.getClass(), "totalBasicHighScore", -2813493605142626659L);
        setLongField(term84, term84.getClass(), "totalAdvancedHighScore", -8885298608300233488L);
        setLongField(term84, term84.getClass(), "totalExpertHighScore", -4325723315152823407L);
        setLongField(term84, term84.getClass(), "totalMasterHighScore", 2535595959091595249L);
        setIntField(term84, term84.getClass(), "friendCount", -655067527);
        setIntField(term127, term127.getClass(), "year", 2015);
        setShortField(term127, term127.getClass(), "month", (short) 9);
        setShortField(term127, term127.getClass(), "day", (short) 19);
        setField(term126, term126.getClass(), "date", term127);
        setByteField(term131, term131.getClass(), "hour", (byte) 9);
        setByteField(term131, term131.getClass(), "minute", (byte) 4);
        setByteField(term131, term131.getClass(), "second", (byte) 10);
        setIntField(term131, term131.getClass(), "nano", 401765865);
        setField(term126, term126.getClass(), "time", term131);
        setField(term84, term84.getClass(), "firstPlayDate", term126);
        setIntField(term137, term137.getClass(), "year", 2015);
        setShortField(term137, term137.getClass(), "month", (short) 4);
        setShortField(term137, term137.getClass(), "day", (short) 14);
        setField(term136, term136.getClass(), "date", term137);
        setByteField(term141, term141.getClass(), "hour", (byte) 18);
        setByteField(term141, term141.getClass(), "minute", (byte) 24);
        setByteField(term141, term141.getClass(), "second", (byte) 32);
        setIntField(term141, term141.getClass(), "nano", 369233818);
        setField(term136, term136.getClass(), "time", term141);
        setField(term84, term84.getClass(), "lastPlayDate", term136);
        setIntField(term84, term84.getClass(), "courseClass", -6029667);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ProfileResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLevel", argTypes, term84, args);
    }

};


