package icu.samnyan.aqua.api.model.resp.sega.chuni.v2;

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
import static icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ProfileResp_getOverPowerPoint_18833871623 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term117808;

    public ProfileResp_getOverPowerPoint_18833871623() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term117808 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp"));
        Object term117851 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term117852 = newInstance(Class.forName("java.time.LocalDate"));
        Object term117856 = newInstance(Class.forName("java.time.LocalTime"));
        Object term117861 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term117862 = newInstance(Class.forName("java.time.LocalDate"));
        Object term117866 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term117808, term117808.getClass(), "userName", "DifGXOBiwI");
        setIntField(term117808, term117808.getClass(), "level", 603696060);
        setField(term117808, term117808.getClass(), "exp", "HLrCvrzuTI");
        setLongField(term117808, term117808.getClass(), "point", -5021693087855771193L);
        setLongField(term117808, term117808.getClass(), "totalPoint", 2423882333498629620L);
        setIntField(term117808, term117808.getClass(), "playCount", -833158351);
        setIntField(term117808, term117808.getClass(), "playerRating", 599716749);
        setIntField(term117808, term117808.getClass(), "highestRating", -2070564470);
        setIntField(term117808, term117808.getClass(), "nameplateId", 2051713365);
        setIntField(term117808, term117808.getClass(), "frameId", 846173309);
        setIntField(term117808, term117808.getClass(), "characterId", -1418363371);
        setIntField(term117808, term117808.getClass(), "trophyId", 1382159036);
        setIntField(term117808, term117808.getClass(), "totalMapNum", 1496993035);
        setLongField(term117808, term117808.getClass(), "totalHiScore", 8143587516001075223L);
        setLongField(term117808, term117808.getClass(), "totalBasicHighScore", -2880696179980955672L);
        setLongField(term117808, term117808.getClass(), "totalAdvancedHighScore", -1549794059683791613L);
        setLongField(term117808, term117808.getClass(), "totalExpertHighScore", 5478152063012904859L);
        setLongField(term117808, term117808.getClass(), "totalMasterHighScore", 7873468309001160488L);
        setLongField(term117808, term117808.getClass(), "totalUltimaHighScore", -4872484045633343100L);
        setIntField(term117808, term117808.getClass(), "friendCount", -68309274);
        setIntField(term117852, term117852.getClass(), "year", 2016);
        setShortField(term117852, term117852.getClass(), "month", (short) 7);
        setShortField(term117852, term117852.getClass(), "day", (short) 3);
        setField(term117851, term117851.getClass(), "date", term117852);
        setByteField(term117856, term117856.getClass(), "hour", (byte) 9);
        setByteField(term117856, term117856.getClass(), "minute", (byte) 37);
        setByteField(term117856, term117856.getClass(), "second", (byte) 29);
        setIntField(term117856, term117856.getClass(), "nano", 466002145);
        setField(term117851, term117851.getClass(), "time", term117856);
        setField(term117808, term117808.getClass(), "firstPlayDate", term117851);
        setIntField(term117862, term117862.getClass(), "year", 2013);
        setShortField(term117862, term117862.getClass(), "month", (short) 2);
        setShortField(term117862, term117862.getClass(), "day", (short) 17);
        setField(term117861, term117861.getClass(), "date", term117862);
        setByteField(term117866, term117866.getClass(), "hour", (byte) 7);
        setByteField(term117866, term117866.getClass(), "minute", (byte) 18);
        setByteField(term117866, term117866.getClass(), "second", (byte) 25);
        setIntField(term117866, term117866.getClass(), "nano", 324778233);
        setField(term117861, term117861.getClass(), "time", term117866);
        setField(term117808, term117808.getClass(), "lastPlayDate", term117861);
        setIntField(term117808, term117808.getClass(), "courseClass", -489483323);
        setIntField(term117808, term117808.getClass(), "overPowerPoint", -2110905530);
        setIntField(term117808, term117808.getClass(), "overPowerRate", -1763342839);
        setIntField(term117808, term117808.getClass(), "mapIconId", -514902719);
        setIntField(term117808, term117808.getClass(), "voiceId", 467590689);
        setIntField(term117808, term117808.getClass(), "avatarWear", -99235229);
        setIntField(term117808, term117808.getClass(), "avatarHead", -253030076);
        setIntField(term117808, term117808.getClass(), "avatarFace", 1269292835);
        setIntField(term117808, term117808.getClass(), "avatarSkin", -1435399887);
        setIntField(term117808, term117808.getClass(), "avatarItem", 1179688921);
        setIntField(term117808, term117808.getClass(), "avatarFront", -462864583);
        setIntField(term117808, term117808.getClass(), "avatarBack", -630972798);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOverPowerPoint", argTypes, term117808, args);
    }

};


