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

public class ProfileResp_getAvatarItem_122073451331 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118568;

    public ProfileResp_getAvatarItem_122073451331() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term118568 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp"));
        Object term118611 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term118612 = newInstance(Class.forName("java.time.LocalDate"));
        Object term118616 = newInstance(Class.forName("java.time.LocalTime"));
        Object term118621 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term118622 = newInstance(Class.forName("java.time.LocalDate"));
        Object term118626 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term118568, term118568.getClass(), "userName", "OuxgUlcbAs");
        setIntField(term118568, term118568.getClass(), "level", -219807811);
        setField(term118568, term118568.getClass(), "exp", "ZTSRAqJUkK");
        setLongField(term118568, term118568.getClass(), "point", 4315564832122393204L);
        setLongField(term118568, term118568.getClass(), "totalPoint", -5903427622839064600L);
        setIntField(term118568, term118568.getClass(), "playCount", -524382882);
        setIntField(term118568, term118568.getClass(), "playerRating", 2119745016);
        setIntField(term118568, term118568.getClass(), "highestRating", 2090835612);
        setIntField(term118568, term118568.getClass(), "nameplateId", 1829125633);
        setIntField(term118568, term118568.getClass(), "frameId", 1092211658);
        setIntField(term118568, term118568.getClass(), "characterId", -1254874258);
        setIntField(term118568, term118568.getClass(), "trophyId", 1004645127);
        setIntField(term118568, term118568.getClass(), "totalMapNum", -1996712937);
        setLongField(term118568, term118568.getClass(), "totalHiScore", 6871045899861495213L);
        setLongField(term118568, term118568.getClass(), "totalBasicHighScore", -6371020941640077376L);
        setLongField(term118568, term118568.getClass(), "totalAdvancedHighScore", -5357991031941140470L);
        setLongField(term118568, term118568.getClass(), "totalExpertHighScore", 4269975313283893844L);
        setLongField(term118568, term118568.getClass(), "totalMasterHighScore", 6469970772728526898L);
        setLongField(term118568, term118568.getClass(), "totalUltimaHighScore", 4165549581279829858L);
        setIntField(term118568, term118568.getClass(), "friendCount", 1666089818);
        setIntField(term118612, term118612.getClass(), "year", 2022);
        setShortField(term118612, term118612.getClass(), "month", (short) 8);
        setShortField(term118612, term118612.getClass(), "day", (short) 28);
        setField(term118611, term118611.getClass(), "date", term118612);
        setByteField(term118616, term118616.getClass(), "hour", (byte) 17);
        setByteField(term118616, term118616.getClass(), "minute", (byte) 48);
        setByteField(term118616, term118616.getClass(), "second", (byte) 9);
        setIntField(term118616, term118616.getClass(), "nano", 29201951);
        setField(term118611, term118611.getClass(), "time", term118616);
        setField(term118568, term118568.getClass(), "firstPlayDate", term118611);
        setIntField(term118622, term118622.getClass(), "year", 2026);
        setShortField(term118622, term118622.getClass(), "month", (short) 5);
        setShortField(term118622, term118622.getClass(), "day", (short) 26);
        setField(term118621, term118621.getClass(), "date", term118622);
        setByteField(term118626, term118626.getClass(), "hour", (byte) 19);
        setByteField(term118626, term118626.getClass(), "minute", (byte) 15);
        setByteField(term118626, term118626.getClass(), "second", (byte) 24);
        setIntField(term118626, term118626.getClass(), "nano", 309355718);
        setField(term118621, term118621.getClass(), "time", term118626);
        setField(term118568, term118568.getClass(), "lastPlayDate", term118621);
        setIntField(term118568, term118568.getClass(), "courseClass", -685950716);
        setIntField(term118568, term118568.getClass(), "overPowerPoint", -2052289432);
        setIntField(term118568, term118568.getClass(), "overPowerRate", 1230234350);
        setIntField(term118568, term118568.getClass(), "mapIconId", -231654755);
        setIntField(term118568, term118568.getClass(), "voiceId", 1712789727);
        setIntField(term118568, term118568.getClass(), "avatarWear", -1121683539);
        setIntField(term118568, term118568.getClass(), "avatarHead", -116994379);
        setIntField(term118568, term118568.getClass(), "avatarFace", -244937324);
        setIntField(term118568, term118568.getClass(), "avatarSkin", -1470862700);
        setIntField(term118568, term118568.getClass(), "avatarItem", 1621596800);
        setIntField(term118568, term118568.getClass(), "avatarFront", -510694515);
        setIntField(term118568, term118568.getClass(), "avatarBack", -1524021680);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAvatarItem", argTypes, term118568, args);
    }

};


