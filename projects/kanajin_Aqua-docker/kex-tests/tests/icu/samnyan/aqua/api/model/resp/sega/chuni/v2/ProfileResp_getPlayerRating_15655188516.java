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

public class ProfileResp_getPlayerRating_15655188516 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term116193;

    public ProfileResp_getPlayerRating_15655188516() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term116193 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp"));
        Object term116236 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term116237 = newInstance(Class.forName("java.time.LocalDate"));
        Object term116241 = newInstance(Class.forName("java.time.LocalTime"));
        Object term116246 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term116247 = newInstance(Class.forName("java.time.LocalDate"));
        Object term116251 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term116193, term116193.getClass(), "userName", "sbgDLSAIXy");
        setIntField(term116193, term116193.getClass(), "level", 489882129);
        setField(term116193, term116193.getClass(), "exp", "aVfwRDxQHA");
        setLongField(term116193, term116193.getClass(), "point", -2807569143698701278L);
        setLongField(term116193, term116193.getClass(), "totalPoint", 7046600999249353201L);
        setIntField(term116193, term116193.getClass(), "playCount", 1111194340);
        setIntField(term116193, term116193.getClass(), "playerRating", 1698295544);
        setIntField(term116193, term116193.getClass(), "highestRating", 886785297);
        setIntField(term116193, term116193.getClass(), "nameplateId", -213160569);
        setIntField(term116193, term116193.getClass(), "frameId", -922824587);
        setIntField(term116193, term116193.getClass(), "characterId", -674002334);
        setIntField(term116193, term116193.getClass(), "trophyId", 161349874);
        setIntField(term116193, term116193.getClass(), "totalMapNum", 676171004);
        setLongField(term116193, term116193.getClass(), "totalHiScore", -4982062716625861655L);
        setLongField(term116193, term116193.getClass(), "totalBasicHighScore", 2126814575177231106L);
        setLongField(term116193, term116193.getClass(), "totalAdvancedHighScore", 8926142430793076843L);
        setLongField(term116193, term116193.getClass(), "totalExpertHighScore", 5288301688317764685L);
        setLongField(term116193, term116193.getClass(), "totalMasterHighScore", -192549936143584170L);
        setLongField(term116193, term116193.getClass(), "totalUltimaHighScore", -6661317679422299538L);
        setIntField(term116193, term116193.getClass(), "friendCount", -1903819022);
        setIntField(term116237, term116237.getClass(), "year", 2010);
        setShortField(term116237, term116237.getClass(), "month", (short) 8);
        setShortField(term116237, term116237.getClass(), "day", (short) 13);
        setField(term116236, term116236.getClass(), "date", term116237);
        setByteField(term116241, term116241.getClass(), "hour", (byte) 20);
        setByteField(term116241, term116241.getClass(), "minute", (byte) 45);
        setByteField(term116241, term116241.getClass(), "second", (byte) 52);
        setIntField(term116241, term116241.getClass(), "nano", 799864809);
        setField(term116236, term116236.getClass(), "time", term116241);
        setField(term116193, term116193.getClass(), "firstPlayDate", term116236);
        setIntField(term116247, term116247.getClass(), "year", 2016);
        setShortField(term116247, term116247.getClass(), "month", (short) 5);
        setShortField(term116247, term116247.getClass(), "day", (short) 16);
        setField(term116246, term116246.getClass(), "date", term116247);
        setByteField(term116251, term116251.getClass(), "hour", (byte) 2);
        setByteField(term116251, term116251.getClass(), "minute", (byte) 27);
        setByteField(term116251, term116251.getClass(), "second", (byte) 10);
        setIntField(term116251, term116251.getClass(), "nano", 587083573);
        setField(term116246, term116246.getClass(), "time", term116251);
        setField(term116193, term116193.getClass(), "lastPlayDate", term116246);
        setIntField(term116193, term116193.getClass(), "courseClass", -1604358171);
        setIntField(term116193, term116193.getClass(), "overPowerPoint", 182929768);
        setIntField(term116193, term116193.getClass(), "overPowerRate", -727890411);
        setIntField(term116193, term116193.getClass(), "mapIconId", -1635089005);
        setIntField(term116193, term116193.getClass(), "voiceId", 1968092668);
        setIntField(term116193, term116193.getClass(), "avatarWear", -1089195626);
        setIntField(term116193, term116193.getClass(), "avatarHead", -456584097);
        setIntField(term116193, term116193.getClass(), "avatarFace", 1444812643);
        setIntField(term116193, term116193.getClass(), "avatarSkin", -186839989);
        setIntField(term116193, term116193.getClass(), "avatarItem", 1489035149);
        setIntField(term116193, term116193.getClass(), "avatarFront", 447477412);
        setIntField(term116193, term116193.getClass(), "avatarBack", -70881281);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayerRating", argTypes, term116193, args);
    }

};


