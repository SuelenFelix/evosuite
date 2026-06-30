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

public class ProfileResp_getTotalHiScore_7036654213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term116858;

    public ProfileResp_getTotalHiScore_7036654213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term116858 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp"));
        Object term116901 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term116902 = newInstance(Class.forName("java.time.LocalDate"));
        Object term116906 = newInstance(Class.forName("java.time.LocalTime"));
        Object term116911 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term116912 = newInstance(Class.forName("java.time.LocalDate"));
        Object term116916 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term116858, term116858.getClass(), "userName", "gaoSmACbfX");
        setIntField(term116858, term116858.getClass(), "level", -1239183764);
        setField(term116858, term116858.getClass(), "exp", "CExsOhxVrR");
        setLongField(term116858, term116858.getClass(), "point", -1842092122808990310L);
        setLongField(term116858, term116858.getClass(), "totalPoint", -5578690760366690489L);
        setIntField(term116858, term116858.getClass(), "playCount", 490405750);
        setIntField(term116858, term116858.getClass(), "playerRating", -1033175910);
        setIntField(term116858, term116858.getClass(), "highestRating", 1703220024);
        setIntField(term116858, term116858.getClass(), "nameplateId", -1071621213);
        setIntField(term116858, term116858.getClass(), "frameId", -1247281571);
        setIntField(term116858, term116858.getClass(), "characterId", -998550287);
        setIntField(term116858, term116858.getClass(), "trophyId", 1957988727);
        setIntField(term116858, term116858.getClass(), "totalMapNum", -75779038);
        setLongField(term116858, term116858.getClass(), "totalHiScore", -1555173812173228463L);
        setLongField(term116858, term116858.getClass(), "totalBasicHighScore", -4294652044004649557L);
        setLongField(term116858, term116858.getClass(), "totalAdvancedHighScore", 2461602899413033249L);
        setLongField(term116858, term116858.getClass(), "totalExpertHighScore", 6907217810396734972L);
        setLongField(term116858, term116858.getClass(), "totalMasterHighScore", 5847949903159530270L);
        setLongField(term116858, term116858.getClass(), "totalUltimaHighScore", -633306304570343659L);
        setIntField(term116858, term116858.getClass(), "friendCount", -727704153);
        setIntField(term116902, term116902.getClass(), "year", 2022);
        setShortField(term116902, term116902.getClass(), "month", (short) 10);
        setShortField(term116902, term116902.getClass(), "day", (short) 24);
        setField(term116901, term116901.getClass(), "date", term116902);
        setByteField(term116906, term116906.getClass(), "hour", (byte) 23);
        setByteField(term116906, term116906.getClass(), "minute", (byte) 53);
        setByteField(term116906, term116906.getClass(), "second", (byte) 17);
        setIntField(term116906, term116906.getClass(), "nano", 436752048);
        setField(term116901, term116901.getClass(), "time", term116906);
        setField(term116858, term116858.getClass(), "firstPlayDate", term116901);
        setIntField(term116912, term116912.getClass(), "year", 2014);
        setShortField(term116912, term116912.getClass(), "month", (short) 4);
        setShortField(term116912, term116912.getClass(), "day", (short) 20);
        setField(term116911, term116911.getClass(), "date", term116912);
        setByteField(term116916, term116916.getClass(), "hour", (byte) 14);
        setByteField(term116916, term116916.getClass(), "minute", (byte) 22);
        setByteField(term116916, term116916.getClass(), "second", (byte) 16);
        setIntField(term116916, term116916.getClass(), "nano", 575310202);
        setField(term116911, term116911.getClass(), "time", term116916);
        setField(term116858, term116858.getClass(), "lastPlayDate", term116911);
        setIntField(term116858, term116858.getClass(), "courseClass", -272049953);
        setIntField(term116858, term116858.getClass(), "overPowerPoint", 1287717873);
        setIntField(term116858, term116858.getClass(), "overPowerRate", -1292513446);
        setIntField(term116858, term116858.getClass(), "mapIconId", -1023813925);
        setIntField(term116858, term116858.getClass(), "voiceId", 2138059893);
        setIntField(term116858, term116858.getClass(), "avatarWear", -1089004883);
        setIntField(term116858, term116858.getClass(), "avatarHead", -229546527);
        setIntField(term116858, term116858.getClass(), "avatarFace", 362892034);
        setIntField(term116858, term116858.getClass(), "avatarSkin", 668494777);
        setIntField(term116858, term116858.getClass(), "avatarItem", 275263644);
        setIntField(term116858, term116858.getClass(), "avatarFront", -650717085);
        setIntField(term116858, term116858.getClass(), "avatarBack", -1908469621);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalHiScore", argTypes, term116858, args);
    }

};


