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
import java.lang.Integer;

public class ProfileResp_setPlayerRating_62899328540 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term119475;
     Object term119550;

    public ProfileResp_setPlayerRating_62899328540() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term119475 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp"));
        Object term119518 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term119519 = newInstance(Class.forName("java.time.LocalDate"));
        Object term119523 = newInstance(Class.forName("java.time.LocalTime"));
        Object term119528 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term119529 = newInstance(Class.forName("java.time.LocalDate"));
        Object term119533 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term119475, term119475.getClass(), "userName", "NxwtNEqZwc");
        setIntField(term119475, term119475.getClass(), "level", 1724552922);
        setField(term119475, term119475.getClass(), "exp", "scXUGbWVgO");
        setLongField(term119475, term119475.getClass(), "point", -7291040769943508901L);
        setLongField(term119475, term119475.getClass(), "totalPoint", -413934315817820959L);
        setIntField(term119475, term119475.getClass(), "playCount", 270517948);
        setIntField(term119475, term119475.getClass(), "playerRating", 798054660);
        setIntField(term119475, term119475.getClass(), "highestRating", 237259515);
        setIntField(term119475, term119475.getClass(), "nameplateId", -1821332735);
        setIntField(term119475, term119475.getClass(), "frameId", -1340691083);
        setIntField(term119475, term119475.getClass(), "characterId", -105003387);
        setIntField(term119475, term119475.getClass(), "trophyId", -1970615106);
        setIntField(term119475, term119475.getClass(), "totalMapNum", 461025179);
        setLongField(term119475, term119475.getClass(), "totalHiScore", 293235674756964190L);
        setLongField(term119475, term119475.getClass(), "totalBasicHighScore", 3569712085909490165L);
        setLongField(term119475, term119475.getClass(), "totalAdvancedHighScore", -500829433762980337L);
        setLongField(term119475, term119475.getClass(), "totalExpertHighScore", 6503491258609255906L);
        setLongField(term119475, term119475.getClass(), "totalMasterHighScore", -2308335036861100736L);
        setLongField(term119475, term119475.getClass(), "totalUltimaHighScore", -7820554667236051803L);
        setIntField(term119475, term119475.getClass(), "friendCount", 954801531);
        setIntField(term119519, term119519.getClass(), "year", 2019);
        setShortField(term119519, term119519.getClass(), "month", (short) 6);
        setShortField(term119519, term119519.getClass(), "day", (short) 14);
        setField(term119518, term119518.getClass(), "date", term119519);
        setByteField(term119523, term119523.getClass(), "hour", (byte) 6);
        setByteField(term119523, term119523.getClass(), "minute", (byte) 22);
        setByteField(term119523, term119523.getClass(), "second", (byte) 12);
        setIntField(term119523, term119523.getClass(), "nano", 884052141);
        setField(term119518, term119518.getClass(), "time", term119523);
        setField(term119475, term119475.getClass(), "firstPlayDate", term119518);
        setIntField(term119529, term119529.getClass(), "year", 2010);
        setShortField(term119529, term119529.getClass(), "month", (short) 9);
        setShortField(term119529, term119529.getClass(), "day", (short) 2);
        setField(term119528, term119528.getClass(), "date", term119529);
        setByteField(term119533, term119533.getClass(), "hour", (byte) 20);
        setByteField(term119533, term119533.getClass(), "minute", (byte) 9);
        setByteField(term119533, term119533.getClass(), "second", (byte) 40);
        setIntField(term119533, term119533.getClass(), "nano", 333675135);
        setField(term119528, term119528.getClass(), "time", term119533);
        setField(term119475, term119475.getClass(), "lastPlayDate", term119528);
        setIntField(term119475, term119475.getClass(), "courseClass", 239275115);
        setIntField(term119475, term119475.getClass(), "overPowerPoint", -1128926923);
        setIntField(term119475, term119475.getClass(), "overPowerRate", -120924858);
        setIntField(term119475, term119475.getClass(), "mapIconId", 1594714539);
        setIntField(term119475, term119475.getClass(), "voiceId", 1585497194);
        setIntField(term119475, term119475.getClass(), "avatarWear", -1294475856);
        setIntField(term119475, term119475.getClass(), "avatarHead", -1724396473);
        setIntField(term119475, term119475.getClass(), "avatarFace", -663518567);
        setIntField(term119475, term119475.getClass(), "avatarSkin", 1876126805);
        setIntField(term119475, term119475.getClass(), "avatarItem", 528844224);
        setIntField(term119475, term119475.getClass(), "avatarFront", 1219678143);
        setIntField(term119475, term119475.getClass(), "avatarBack", 683176883);
        term119550 = new Integer(622790248);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term119550;
        callMethod(klass, "setPlayerRating", argTypes, term119475, args);
    }

};


