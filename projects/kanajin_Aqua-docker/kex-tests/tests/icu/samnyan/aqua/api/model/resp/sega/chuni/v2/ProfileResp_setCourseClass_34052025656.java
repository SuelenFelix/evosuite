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

public class ProfileResp_setCourseClass_34052025656 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term121043;
     Object term121118;

    public ProfileResp_setCourseClass_34052025656() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term121043 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp"));
        Object term121086 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term121087 = newInstance(Class.forName("java.time.LocalDate"));
        Object term121091 = newInstance(Class.forName("java.time.LocalTime"));
        Object term121096 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term121097 = newInstance(Class.forName("java.time.LocalDate"));
        Object term121101 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term121043, term121043.getClass(), "userName", "YOaDBGAdOq");
        setIntField(term121043, term121043.getClass(), "level", -1266917999);
        setField(term121043, term121043.getClass(), "exp", "spXHUvRLTA");
        setLongField(term121043, term121043.getClass(), "point", -2125061462119711228L);
        setLongField(term121043, term121043.getClass(), "totalPoint", -3428770597224171053L);
        setIntField(term121043, term121043.getClass(), "playCount", -706987234);
        setIntField(term121043, term121043.getClass(), "playerRating", -1213654900);
        setIntField(term121043, term121043.getClass(), "highestRating", -617089267);
        setIntField(term121043, term121043.getClass(), "nameplateId", 988368765);
        setIntField(term121043, term121043.getClass(), "frameId", -378771874);
        setIntField(term121043, term121043.getClass(), "characterId", 1086217362);
        setIntField(term121043, term121043.getClass(), "trophyId", 1651721701);
        setIntField(term121043, term121043.getClass(), "totalMapNum", 1025913722);
        setLongField(term121043, term121043.getClass(), "totalHiScore", -3413980375186372780L);
        setLongField(term121043, term121043.getClass(), "totalBasicHighScore", -3927002892088936458L);
        setLongField(term121043, term121043.getClass(), "totalAdvancedHighScore", -1524938613535085779L);
        setLongField(term121043, term121043.getClass(), "totalExpertHighScore", 455970307373465843L);
        setLongField(term121043, term121043.getClass(), "totalMasterHighScore", 3034593502266726093L);
        setLongField(term121043, term121043.getClass(), "totalUltimaHighScore", 5291887730700950962L);
        setIntField(term121043, term121043.getClass(), "friendCount", 2121380654);
        setIntField(term121087, term121087.getClass(), "year", 2013);
        setShortField(term121087, term121087.getClass(), "month", (short) 4);
        setShortField(term121087, term121087.getClass(), "day", (short) 23);
        setField(term121086, term121086.getClass(), "date", term121087);
        setByteField(term121091, term121091.getClass(), "hour", (byte) 22);
        setByteField(term121091, term121091.getClass(), "minute", (byte) 34);
        setByteField(term121091, term121091.getClass(), "second", (byte) 8);
        setIntField(term121091, term121091.getClass(), "nano", 153222166);
        setField(term121086, term121086.getClass(), "time", term121091);
        setField(term121043, term121043.getClass(), "firstPlayDate", term121086);
        setIntField(term121097, term121097.getClass(), "year", 2023);
        setShortField(term121097, term121097.getClass(), "month", (short) 8);
        setShortField(term121097, term121097.getClass(), "day", (short) 23);
        setField(term121096, term121096.getClass(), "date", term121097);
        setByteField(term121101, term121101.getClass(), "hour", (byte) 1);
        setByteField(term121101, term121101.getClass(), "minute", (byte) 30);
        setByteField(term121101, term121101.getClass(), "second", (byte) 48);
        setIntField(term121101, term121101.getClass(), "nano", 789002883);
        setField(term121096, term121096.getClass(), "time", term121101);
        setField(term121043, term121043.getClass(), "lastPlayDate", term121096);
        setIntField(term121043, term121043.getClass(), "courseClass", -147043863);
        setIntField(term121043, term121043.getClass(), "overPowerPoint", 1520191474);
        setIntField(term121043, term121043.getClass(), "overPowerRate", 700066165);
        setIntField(term121043, term121043.getClass(), "mapIconId", 265596081);
        setIntField(term121043, term121043.getClass(), "voiceId", 1840367436);
        setIntField(term121043, term121043.getClass(), "avatarWear", 1499527278);
        setIntField(term121043, term121043.getClass(), "avatarHead", 1872012686);
        setIntField(term121043, term121043.getClass(), "avatarFace", -711251543);
        setIntField(term121043, term121043.getClass(), "avatarSkin", 1064967000);
        setIntField(term121043, term121043.getClass(), "avatarItem", 1254065406);
        setIntField(term121043, term121043.getClass(), "avatarFront", 1789868995);
        setIntField(term121043, term121043.getClass(), "avatarBack", -994066404);
        term121118 = new Integer(1687060830);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term121118;
        callMethod(klass, "setCourseClass", argTypes, term121043, args);
    }

};


