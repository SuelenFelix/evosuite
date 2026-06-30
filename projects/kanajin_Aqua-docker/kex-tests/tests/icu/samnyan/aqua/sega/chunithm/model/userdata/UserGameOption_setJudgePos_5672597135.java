package icu.samnyan.aqua.sega.chunithm.model.userdata;

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
import static icu.samnyan.aqua.sega.chunithm.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;
import java.lang.Integer;

public class UserGameOption_setJudgePos_5672597135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64915;
     Object term65215;

    public UserGameOption_setJudgePos_5672597135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term64921 = new Long(-4924950707540628022L);
        term64915 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOption"));
        Object term64917 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term64919 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term64935 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term64936 = newInstance(Class.forName("java.time.LocalDate"));
        Object term64940 = newInstance(Class.forName("java.time.LocalTime"));
        Object term64945 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term64946 = newInstance(Class.forName("java.time.LocalDate"));
        Object term64950 = newInstance(Class.forName("java.time.LocalTime"));
        Object term64967 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term64968 = newInstance(Class.forName("java.time.LocalDate"));
        Object term64972 = newInstance(Class.forName("java.time.LocalTime"));
        Object term65028 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term65029 = newInstance(Class.forName("java.time.LocalDate"));
        Object term65033 = newInstance(Class.forName("java.time.LocalTime"));
        Object term65076 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term65077 = newInstance(Class.forName("java.time.LocalDate"));
        Object term65081 = newInstance(Class.forName("java.time.LocalTime"));
        Object term65122 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term65123 = newInstance(Class.forName("java.time.LocalDate"));
        Object term65127 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term64915, term64915.getClass(), "id", 8240231262183296861L);
        setLongField(term64917, term64917.getClass(), "id", -5557521111022569289L);
        setLongField(term64919, term64919.getClass(), "id", 508795580601675574L);
        setField(term64919, term64919.getClass(), "extId", term64921);
        setField(term64919, term64919.getClass(), "luid", "FqrcltWSUd");
        setIntField(term64936, term64936.getClass(), "year", 2027);
        setShortField(term64936, term64936.getClass(), "month", (short) 7);
        setShortField(term64936, term64936.getClass(), "day", (short) 21);
        setField(term64935, term64935.getClass(), "date", term64936);
        setByteField(term64940, term64940.getClass(), "hour", (byte) 9);
        setByteField(term64940, term64940.getClass(), "minute", (byte) 42);
        setByteField(term64940, term64940.getClass(), "second", (byte) 16);
        setIntField(term64940, term64940.getClass(), "nano", 660359132);
        setField(term64935, term64935.getClass(), "time", term64940);
        setField(term64919, term64919.getClass(), "registerTime", term64935);
        setIntField(term64946, term64946.getClass(), "year", 2022);
        setShortField(term64946, term64946.getClass(), "month", (short) 12);
        setShortField(term64946, term64946.getClass(), "day", (short) 24);
        setField(term64945, term64945.getClass(), "date", term64946);
        setByteField(term64950, term64950.getClass(), "hour", (byte) 7);
        setByteField(term64950, term64950.getClass(), "minute", (byte) 20);
        setByteField(term64950, term64950.getClass(), "second", (byte) 0);
        setIntField(term64950, term64950.getClass(), "nano", 127843410);
        setField(term64945, term64945.getClass(), "time", term64950);
        setField(term64919, term64919.getClass(), "accessTime", term64945);
        setField(term64917, term64917.getClass(), "card", term64919);
        setField(term64917, term64917.getClass(), "userName", "kAbILlhsZw");
        setIntField(term64968, term64968.getClass(), "year", 2019);
        setShortField(term64968, term64968.getClass(), "month", (short) 4);
        setShortField(term64968, term64968.getClass(), "day", (short) 30);
        setField(term64967, term64967.getClass(), "date", term64968);
        setByteField(term64972, term64972.getClass(), "hour", (byte) 11);
        setByteField(term64972, term64972.getClass(), "minute", (byte) 21);
        setByteField(term64972, term64972.getClass(), "second", (byte) 24);
        setIntField(term64972, term64972.getClass(), "nano", 799334249);
        setField(term64967, term64967.getClass(), "time", term64972);
        setField(term64917, term64917.getClass(), "lastLoginDate", term64967);
        setBooleanField(term64917, term64917.getClass(), "isWebJoin", true);
        setField(term64917, term64917.getClass(), "webLimitDate", "QsIOCSpRow");
        setIntField(term64917, term64917.getClass(), "level", -2087784193);
        setIntField(term64917, term64917.getClass(), "reincarnationNum", -112933890);
        setField(term64917, term64917.getClass(), "exp", "gcFzvYOUch");
        setLongField(term64917, term64917.getClass(), "point", 3872000207938391416L);
        setLongField(term64917, term64917.getClass(), "totalPoint", -1383665096049300821L);
        setIntField(term64917, term64917.getClass(), "playCount", -1810303698);
        setIntField(term64917, term64917.getClass(), "multiPlayCount", 3658317);
        setIntField(term64917, term64917.getClass(), "multiWinCount", -1463342660);
        setIntField(term64917, term64917.getClass(), "requestResCount", 20803526);
        setIntField(term64917, term64917.getClass(), "acceptResCount", 1322938574);
        setIntField(term64917, term64917.getClass(), "successResCount", -1636808378);
        setIntField(term64917, term64917.getClass(), "playerRating", 1132856767);
        setIntField(term64917, term64917.getClass(), "highestRating", 1028135109);
        setIntField(term64917, term64917.getClass(), "nameplateId", -576638264);
        setIntField(term64917, term64917.getClass(), "frameId", -582124031);
        setIntField(term64917, term64917.getClass(), "characterId", -1908433542);
        setIntField(term64917, term64917.getClass(), "trophyId", 700489923);
        setIntField(term64917, term64917.getClass(), "playedTutorialBit", -1490991707);
        setIntField(term64917, term64917.getClass(), "firstTutorialCancelNum", -1869327557);
        setIntField(term64917, term64917.getClass(), "masterTutorialCancelNum", -1846337897);
        setIntField(term64917, term64917.getClass(), "totalRepertoireCount", 1156768326);
        setIntField(term64917, term64917.getClass(), "totalMapNum", -393842466);
        setLongField(term64917, term64917.getClass(), "totalHiScore", 3462550822198292676L);
        setLongField(term64917, term64917.getClass(), "totalBasicHighScore", 4366106993552057355L);
        setLongField(term64917, term64917.getClass(), "totalAdvancedHighScore", -1403100578084357233L);
        setLongField(term64917, term64917.getClass(), "totalExpertHighScore", -5878958370799790472L);
        setLongField(term64917, term64917.getClass(), "totalMasterHighScore", 1801020535033823321L);
        setIntField(term65029, term65029.getClass(), "year", 2012);
        setShortField(term65029, term65029.getClass(), "month", (short) 10);
        setShortField(term65029, term65029.getClass(), "day", (short) 18);
        setField(term65028, term65028.getClass(), "date", term65029);
        setByteField(term65033, term65033.getClass(), "hour", (byte) 0);
        setByteField(term65033, term65033.getClass(), "minute", (byte) 2);
        setByteField(term65033, term65033.getClass(), "second", (byte) 34);
        setIntField(term65033, term65033.getClass(), "nano", 773422612);
        setField(term65028, term65028.getClass(), "time", term65033);
        setField(term64917, term64917.getClass(), "eventWatchedDate", term65028);
        setIntField(term64917, term64917.getClass(), "friendCount", 2011572896);
        setBooleanField(term64917, term64917.getClass(), "isMaimai", true);
        setField(term64917, term64917.getClass(), "firstGameId", "NnFSMXLOUA");
        setField(term64917, term64917.getClass(), "firstRomVersion", "bacruLIvDW");
        setField(term64917, term64917.getClass(), "firstDataVersion", "ydbVEuslYx");
        setIntField(term65077, term65077.getClass(), "year", 2027);
        setShortField(term65077, term65077.getClass(), "month", (short) 10);
        setShortField(term65077, term65077.getClass(), "day", (short) 4);
        setField(term65076, term65076.getClass(), "date", term65077);
        setByteField(term65081, term65081.getClass(), "hour", (byte) 18);
        setByteField(term65081, term65081.getClass(), "minute", (byte) 14);
        setByteField(term65081, term65081.getClass(), "second", (byte) 14);
        setIntField(term65081, term65081.getClass(), "nano", 221363683);
        setField(term65076, term65076.getClass(), "time", term65081);
        setField(term64917, term64917.getClass(), "firstPlayDate", term65076);
        setField(term64917, term64917.getClass(), "lastGameId", "DKWEhukBpG");
        setField(term64917, term64917.getClass(), "lastRomVersion", "YaowqyqxBH");
        setField(term64917, term64917.getClass(), "lastDataVersion", "dbxhsKyZWZ");
        setIntField(term65123, term65123.getClass(), "year", 2014);
        setShortField(term65123, term65123.getClass(), "month", (short) 9);
        setShortField(term65123, term65123.getClass(), "day", (short) 21);
        setField(term65122, term65122.getClass(), "date", term65123);
        setByteField(term65127, term65127.getClass(), "hour", (byte) 13);
        setByteField(term65127, term65127.getClass(), "minute", (byte) 30);
        setByteField(term65127, term65127.getClass(), "second", (byte) 57);
        setIntField(term65127, term65127.getClass(), "nano", 749136236);
        setField(term65122, term65122.getClass(), "time", term65127);
        setField(term64917, term64917.getClass(), "lastPlayDate", term65122);
        setIntField(term64917, term64917.getClass(), "lastPlaceId", 1517650676);
        setField(term64917, term64917.getClass(), "lastPlaceName", "oXxafKyyrx");
        setField(term64917, term64917.getClass(), "lastRegionId", "TapDFGQNLY");
        setField(term64917, term64917.getClass(), "lastRegionName", "vgHeAegSfV");
        setField(term64917, term64917.getClass(), "lastAllNetId", "qShfKMgKGs");
        setField(term64917, term64917.getClass(), "lastClientId", "bLCaDnEUyS");
        setField(term64915, term64915.getClass(), "user", term64917);
        setIntField(term64915, term64915.getClass(), "bgInfo", -1559743160);
        setIntField(term64915, term64915.getClass(), "fieldColor", -2067828357);
        setIntField(term64915, term64915.getClass(), "guideSound", -2049221981);
        setIntField(term64915, term64915.getClass(), "soundEffect", 2046964718);
        setIntField(term64915, term64915.getClass(), "guideLine", 1610353449);
        setIntField(term64915, term64915.getClass(), "speed", -1431201540);
        setIntField(term64915, term64915.getClass(), "optionSet", 921611666);
        setIntField(term64915, term64915.getClass(), "matching", 505159138);
        setIntField(term64915, term64915.getClass(), "judgePos", 816436710);
        setIntField(term64915, term64915.getClass(), "rating", 1372386941);
        setIntField(term64915, term64915.getClass(), "judgeJustice", -558285340);
        setIntField(term64915, term64915.getClass(), "judgeAttack", -1351747599);
        setIntField(term64915, term64915.getClass(), "headphone", 376811147);
        setIntField(term64915, term64915.getClass(), "playerLevel", 1230466580);
        setIntField(term64915, term64915.getClass(), "successTap", -367049771);
        setIntField(term64915, term64915.getClass(), "successExTap", 469812226);
        setIntField(term64915, term64915.getClass(), "successSlideHold", 1798598374);
        setIntField(term64915, term64915.getClass(), "successAir", -1689820547);
        setIntField(term64915, term64915.getClass(), "successFlick", 100902964);
        setIntField(term64915, term64915.getClass(), "successSkill", -619984116);
        setIntField(term64915, term64915.getClass(), "successTapTimbre", -468766084);
        setIntField(term64915, term64915.getClass(), "privacy", -1511205639);
        term65215 = new Integer(488730747);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term65215;
        callMethod(klass, "setJudgePos", argTypes, term64915, args);
    }

};


