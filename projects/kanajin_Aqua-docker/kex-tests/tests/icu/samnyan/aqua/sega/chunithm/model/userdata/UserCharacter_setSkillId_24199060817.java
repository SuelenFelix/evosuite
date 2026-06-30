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

public class UserCharacter_setSkillId_24199060817 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term115897;
     Object term116184;

    public UserCharacter_setSkillId_24199060817() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term115903 = new Long(-1592696983130738594L);
        term115897 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCharacter"));
        Object term115899 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term115901 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term115917 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term115918 = newInstance(Class.forName("java.time.LocalDate"));
        Object term115922 = newInstance(Class.forName("java.time.LocalTime"));
        Object term115927 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term115928 = newInstance(Class.forName("java.time.LocalDate"));
        Object term115932 = newInstance(Class.forName("java.time.LocalTime"));
        Object term115949 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term115950 = newInstance(Class.forName("java.time.LocalDate"));
        Object term115954 = newInstance(Class.forName("java.time.LocalTime"));
        Object term116010 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term116011 = newInstance(Class.forName("java.time.LocalDate"));
        Object term116015 = newInstance(Class.forName("java.time.LocalTime"));
        Object term116058 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term116059 = newInstance(Class.forName("java.time.LocalDate"));
        Object term116063 = newInstance(Class.forName("java.time.LocalTime"));
        Object term116104 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term116105 = newInstance(Class.forName("java.time.LocalDate"));
        Object term116109 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term115897, term115897.getClass(), "id", 7423170877012730750L);
        setLongField(term115899, term115899.getClass(), "id", 7803973570843908106L);
        setLongField(term115901, term115901.getClass(), "id", -8551144578264531851L);
        setField(term115901, term115901.getClass(), "extId", term115903);
        setField(term115901, term115901.getClass(), "luid", "BeeLASibwX");
        setIntField(term115918, term115918.getClass(), "year", 2020);
        setShortField(term115918, term115918.getClass(), "month", (short) 8);
        setShortField(term115918, term115918.getClass(), "day", (short) 23);
        setField(term115917, term115917.getClass(), "date", term115918);
        setByteField(term115922, term115922.getClass(), "hour", (byte) 22);
        setByteField(term115922, term115922.getClass(), "minute", (byte) 19);
        setByteField(term115922, term115922.getClass(), "second", (byte) 9);
        setIntField(term115922, term115922.getClass(), "nano", 356061612);
        setField(term115917, term115917.getClass(), "time", term115922);
        setField(term115901, term115901.getClass(), "registerTime", term115917);
        setIntField(term115928, term115928.getClass(), "year", 2025);
        setShortField(term115928, term115928.getClass(), "month", (short) 7);
        setShortField(term115928, term115928.getClass(), "day", (short) 31);
        setField(term115927, term115927.getClass(), "date", term115928);
        setByteField(term115932, term115932.getClass(), "hour", (byte) 8);
        setByteField(term115932, term115932.getClass(), "minute", (byte) 27);
        setByteField(term115932, term115932.getClass(), "second", (byte) 32);
        setIntField(term115932, term115932.getClass(), "nano", 822056119);
        setField(term115927, term115927.getClass(), "time", term115932);
        setField(term115901, term115901.getClass(), "accessTime", term115927);
        setField(term115899, term115899.getClass(), "card", term115901);
        setField(term115899, term115899.getClass(), "userName", "BqctwXkUdR");
        setIntField(term115950, term115950.getClass(), "year", 2011);
        setShortField(term115950, term115950.getClass(), "month", (short) 6);
        setShortField(term115950, term115950.getClass(), "day", (short) 23);
        setField(term115949, term115949.getClass(), "date", term115950);
        setByteField(term115954, term115954.getClass(), "hour", (byte) 8);
        setByteField(term115954, term115954.getClass(), "minute", (byte) 46);
        setByteField(term115954, term115954.getClass(), "second", (byte) 20);
        setIntField(term115954, term115954.getClass(), "nano", 717155966);
        setField(term115949, term115949.getClass(), "time", term115954);
        setField(term115899, term115899.getClass(), "lastLoginDate", term115949);
        setBooleanField(term115899, term115899.getClass(), "isWebJoin", false);
        setField(term115899, term115899.getClass(), "webLimitDate", "GRVnFiwbnZ");
        setIntField(term115899, term115899.getClass(), "level", -1230485683);
        setIntField(term115899, term115899.getClass(), "reincarnationNum", -341831994);
        setField(term115899, term115899.getClass(), "exp", "bZevkoTsGp");
        setLongField(term115899, term115899.getClass(), "point", -6175399542762744541L);
        setLongField(term115899, term115899.getClass(), "totalPoint", 29485421867077167L);
        setIntField(term115899, term115899.getClass(), "playCount", -190607004);
        setIntField(term115899, term115899.getClass(), "multiPlayCount", 1193989353);
        setIntField(term115899, term115899.getClass(), "multiWinCount", 701908779);
        setIntField(term115899, term115899.getClass(), "requestResCount", -1681756654);
        setIntField(term115899, term115899.getClass(), "acceptResCount", -872888112);
        setIntField(term115899, term115899.getClass(), "successResCount", 893339147);
        setIntField(term115899, term115899.getClass(), "playerRating", 1550463846);
        setIntField(term115899, term115899.getClass(), "highestRating", 693808687);
        setIntField(term115899, term115899.getClass(), "nameplateId", -1713920125);
        setIntField(term115899, term115899.getClass(), "frameId", -242270358);
        setIntField(term115899, term115899.getClass(), "characterId", 1299600213);
        setIntField(term115899, term115899.getClass(), "trophyId", 1067527367);
        setIntField(term115899, term115899.getClass(), "playedTutorialBit", 74605400);
        setIntField(term115899, term115899.getClass(), "firstTutorialCancelNum", 642608767);
        setIntField(term115899, term115899.getClass(), "masterTutorialCancelNum", 1819464978);
        setIntField(term115899, term115899.getClass(), "totalRepertoireCount", -1556266779);
        setIntField(term115899, term115899.getClass(), "totalMapNum", 2078431621);
        setLongField(term115899, term115899.getClass(), "totalHiScore", -7381251249931678452L);
        setLongField(term115899, term115899.getClass(), "totalBasicHighScore", 775304117546862589L);
        setLongField(term115899, term115899.getClass(), "totalAdvancedHighScore", -4520444483838062371L);
        setLongField(term115899, term115899.getClass(), "totalExpertHighScore", -8893605933191232807L);
        setLongField(term115899, term115899.getClass(), "totalMasterHighScore", -3893597296102674689L);
        setIntField(term116011, term116011.getClass(), "year", 2013);
        setShortField(term116011, term116011.getClass(), "month", (short) 9);
        setShortField(term116011, term116011.getClass(), "day", (short) 24);
        setField(term116010, term116010.getClass(), "date", term116011);
        setByteField(term116015, term116015.getClass(), "hour", (byte) 14);
        setByteField(term116015, term116015.getClass(), "minute", (byte) 57);
        setByteField(term116015, term116015.getClass(), "second", (byte) 35);
        setIntField(term116015, term116015.getClass(), "nano", 755106426);
        setField(term116010, term116010.getClass(), "time", term116015);
        setField(term115899, term115899.getClass(), "eventWatchedDate", term116010);
        setIntField(term115899, term115899.getClass(), "friendCount", -316254290);
        setBooleanField(term115899, term115899.getClass(), "isMaimai", true);
        setField(term115899, term115899.getClass(), "firstGameId", "TjanzjjMgi");
        setField(term115899, term115899.getClass(), "firstRomVersion", "UOZvJkhjUs");
        setField(term115899, term115899.getClass(), "firstDataVersion", "hUVFihsVHL");
        setIntField(term116059, term116059.getClass(), "year", 2013);
        setShortField(term116059, term116059.getClass(), "month", (short) 5);
        setShortField(term116059, term116059.getClass(), "day", (short) 26);
        setField(term116058, term116058.getClass(), "date", term116059);
        setByteField(term116063, term116063.getClass(), "hour", (byte) 13);
        setByteField(term116063, term116063.getClass(), "minute", (byte) 14);
        setByteField(term116063, term116063.getClass(), "second", (byte) 4);
        setIntField(term116063, term116063.getClass(), "nano", 125550160);
        setField(term116058, term116058.getClass(), "time", term116063);
        setField(term115899, term115899.getClass(), "firstPlayDate", term116058);
        setField(term115899, term115899.getClass(), "lastGameId", "PUamQqZNZj");
        setField(term115899, term115899.getClass(), "lastRomVersion", "tfDqvBMzfw");
        setField(term115899, term115899.getClass(), "lastDataVersion", "rJfJfBomXU");
        setIntField(term116105, term116105.getClass(), "year", 2019);
        setShortField(term116105, term116105.getClass(), "month", (short) 8);
        setShortField(term116105, term116105.getClass(), "day", (short) 15);
        setField(term116104, term116104.getClass(), "date", term116105);
        setByteField(term116109, term116109.getClass(), "hour", (byte) 13);
        setByteField(term116109, term116109.getClass(), "minute", (byte) 37);
        setByteField(term116109, term116109.getClass(), "second", (byte) 43);
        setIntField(term116109, term116109.getClass(), "nano", 174771933);
        setField(term116104, term116104.getClass(), "time", term116109);
        setField(term115899, term115899.getClass(), "lastPlayDate", term116104);
        setIntField(term115899, term115899.getClass(), "lastPlaceId", 923308344);
        setField(term115899, term115899.getClass(), "lastPlaceName", "kBdJQbVecB");
        setField(term115899, term115899.getClass(), "lastRegionId", "JlirfQsPTm");
        setField(term115899, term115899.getClass(), "lastRegionName", "jqfJtiVFaf");
        setField(term115899, term115899.getClass(), "lastAllNetId", "ZvqUprynBE");
        setField(term115899, term115899.getClass(), "lastClientId", "WFTVkzwtMV");
        setField(term115897, term115897.getClass(), "user", term115899);
        setIntField(term115897, term115897.getClass(), "characterId", -30626466);
        setIntField(term115897, term115897.getClass(), "playCount", 393740799);
        setIntField(term115897, term115897.getClass(), "level", 1);
        setIntField(term115897, term115897.getClass(), "skillId", -148451361);
        setIntField(term115897, term115897.getClass(), "friendshipExp", -1277311250);
        setBooleanField(term115897, term115897.getClass(), "isValid", true);
        setBooleanField(term115897, term115897.getClass(), "isNewMark", true);
        setIntField(term115897, term115897.getClass(), "param1", -443857266);
        setIntField(term115897, term115897.getClass(), "param2", 1150039325);
        term116184 = new Integer(1805122380);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCharacter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term116184;
        callMethod(klass, "setSkillId", argTypes, term115897, args);
    }

};


