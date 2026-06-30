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

public class UserDuel_getUser_16525181622 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75729;

    public UserDuel_getUser_16525181622() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term75735 = new Long(-1616722610139554082L);
        term75729 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserDuel"));
        Object term75731 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term75733 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term75749 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term75750 = newInstance(Class.forName("java.time.LocalDate"));
        Object term75754 = newInstance(Class.forName("java.time.LocalTime"));
        Object term75759 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term75760 = newInstance(Class.forName("java.time.LocalDate"));
        Object term75764 = newInstance(Class.forName("java.time.LocalTime"));
        Object term75781 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term75782 = newInstance(Class.forName("java.time.LocalDate"));
        Object term75786 = newInstance(Class.forName("java.time.LocalTime"));
        Object term75842 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term75843 = newInstance(Class.forName("java.time.LocalDate"));
        Object term75847 = newInstance(Class.forName("java.time.LocalTime"));
        Object term75890 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term75891 = newInstance(Class.forName("java.time.LocalDate"));
        Object term75895 = newInstance(Class.forName("java.time.LocalTime"));
        Object term75936 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term75937 = newInstance(Class.forName("java.time.LocalDate"));
        Object term75941 = newInstance(Class.forName("java.time.LocalTime"));
        Object term76011 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term76012 = newInstance(Class.forName("java.time.LocalDate"));
        Object term76016 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term75729, term75729.getClass(), "id", 1551212309300619628L);
        setLongField(term75731, term75731.getClass(), "id", -4520530213003895999L);
        setLongField(term75733, term75733.getClass(), "id", 1915067600167472834L);
        setField(term75733, term75733.getClass(), "extId", term75735);
        setField(term75733, term75733.getClass(), "luid", "wIDeyLnekQ");
        setIntField(term75750, term75750.getClass(), "year", 2028);
        setShortField(term75750, term75750.getClass(), "month", (short) 8);
        setShortField(term75750, term75750.getClass(), "day", (short) 27);
        setField(term75749, term75749.getClass(), "date", term75750);
        setByteField(term75754, term75754.getClass(), "hour", (byte) 5);
        setByteField(term75754, term75754.getClass(), "minute", (byte) 50);
        setByteField(term75754, term75754.getClass(), "second", (byte) 39);
        setIntField(term75754, term75754.getClass(), "nano", 452455240);
        setField(term75749, term75749.getClass(), "time", term75754);
        setField(term75733, term75733.getClass(), "registerTime", term75749);
        setIntField(term75760, term75760.getClass(), "year", 2014);
        setShortField(term75760, term75760.getClass(), "month", (short) 12);
        setShortField(term75760, term75760.getClass(), "day", (short) 10);
        setField(term75759, term75759.getClass(), "date", term75760);
        setByteField(term75764, term75764.getClass(), "hour", (byte) 0);
        setByteField(term75764, term75764.getClass(), "minute", (byte) 19);
        setByteField(term75764, term75764.getClass(), "second", (byte) 30);
        setIntField(term75764, term75764.getClass(), "nano", 874948769);
        setField(term75759, term75759.getClass(), "time", term75764);
        setField(term75733, term75733.getClass(), "accessTime", term75759);
        setField(term75731, term75731.getClass(), "card", term75733);
        setField(term75731, term75731.getClass(), "userName", "tOGPTIqSMm");
        setIntField(term75782, term75782.getClass(), "year", 2016);
        setShortField(term75782, term75782.getClass(), "month", (short) 1);
        setShortField(term75782, term75782.getClass(), "day", (short) 29);
        setField(term75781, term75781.getClass(), "date", term75782);
        setByteField(term75786, term75786.getClass(), "hour", (byte) 12);
        setByteField(term75786, term75786.getClass(), "minute", (byte) 41);
        setByteField(term75786, term75786.getClass(), "second", (byte) 10);
        setIntField(term75786, term75786.getClass(), "nano", 153443383);
        setField(term75781, term75781.getClass(), "time", term75786);
        setField(term75731, term75731.getClass(), "lastLoginDate", term75781);
        setBooleanField(term75731, term75731.getClass(), "isWebJoin", false);
        setField(term75731, term75731.getClass(), "webLimitDate", "cFwZnaLmLP");
        setIntField(term75731, term75731.getClass(), "level", 662682481);
        setIntField(term75731, term75731.getClass(), "reincarnationNum", 51649517);
        setField(term75731, term75731.getClass(), "exp", "cBtfnWBMkE");
        setLongField(term75731, term75731.getClass(), "point", -5052214162065838650L);
        setLongField(term75731, term75731.getClass(), "totalPoint", -94222650078853780L);
        setIntField(term75731, term75731.getClass(), "playCount", -416813909);
        setIntField(term75731, term75731.getClass(), "multiPlayCount", -894882289);
        setIntField(term75731, term75731.getClass(), "multiWinCount", 270964023);
        setIntField(term75731, term75731.getClass(), "requestResCount", -66130728);
        setIntField(term75731, term75731.getClass(), "acceptResCount", -720277275);
        setIntField(term75731, term75731.getClass(), "successResCount", 1131634307);
        setIntField(term75731, term75731.getClass(), "playerRating", -898785465);
        setIntField(term75731, term75731.getClass(), "highestRating", 1852804936);
        setIntField(term75731, term75731.getClass(), "nameplateId", 53950838);
        setIntField(term75731, term75731.getClass(), "frameId", -180263871);
        setIntField(term75731, term75731.getClass(), "characterId", 787708003);
        setIntField(term75731, term75731.getClass(), "trophyId", -1238626650);
        setIntField(term75731, term75731.getClass(), "playedTutorialBit", 1251835216);
        setIntField(term75731, term75731.getClass(), "firstTutorialCancelNum", -1462529055);
        setIntField(term75731, term75731.getClass(), "masterTutorialCancelNum", 1576372849);
        setIntField(term75731, term75731.getClass(), "totalRepertoireCount", 1296336460);
        setIntField(term75731, term75731.getClass(), "totalMapNum", -1024380992);
        setLongField(term75731, term75731.getClass(), "totalHiScore", -2164399567942958295L);
        setLongField(term75731, term75731.getClass(), "totalBasicHighScore", 6485127487584904536L);
        setLongField(term75731, term75731.getClass(), "totalAdvancedHighScore", 6217646173265243924L);
        setLongField(term75731, term75731.getClass(), "totalExpertHighScore", 4772045766380729761L);
        setLongField(term75731, term75731.getClass(), "totalMasterHighScore", -5215160586515108435L);
        setIntField(term75843, term75843.getClass(), "year", 2024);
        setShortField(term75843, term75843.getClass(), "month", (short) 5);
        setShortField(term75843, term75843.getClass(), "day", (short) 2);
        setField(term75842, term75842.getClass(), "date", term75843);
        setByteField(term75847, term75847.getClass(), "hour", (byte) 16);
        setByteField(term75847, term75847.getClass(), "minute", (byte) 41);
        setByteField(term75847, term75847.getClass(), "second", (byte) 21);
        setIntField(term75847, term75847.getClass(), "nano", 463370731);
        setField(term75842, term75842.getClass(), "time", term75847);
        setField(term75731, term75731.getClass(), "eventWatchedDate", term75842);
        setIntField(term75731, term75731.getClass(), "friendCount", 274867099);
        setBooleanField(term75731, term75731.getClass(), "isMaimai", false);
        setField(term75731, term75731.getClass(), "firstGameId", "sFixkFlMhw");
        setField(term75731, term75731.getClass(), "firstRomVersion", "wNaCYPwDGZ");
        setField(term75731, term75731.getClass(), "firstDataVersion", "CFojehEtAR");
        setIntField(term75891, term75891.getClass(), "year", 2027);
        setShortField(term75891, term75891.getClass(), "month", (short) 10);
        setShortField(term75891, term75891.getClass(), "day", (short) 4);
        setField(term75890, term75890.getClass(), "date", term75891);
        setByteField(term75895, term75895.getClass(), "hour", (byte) 23);
        setByteField(term75895, term75895.getClass(), "minute", (byte) 48);
        setByteField(term75895, term75895.getClass(), "second", (byte) 10);
        setIntField(term75895, term75895.getClass(), "nano", 256586329);
        setField(term75890, term75890.getClass(), "time", term75895);
        setField(term75731, term75731.getClass(), "firstPlayDate", term75890);
        setField(term75731, term75731.getClass(), "lastGameId", "EYeLeoxDrM");
        setField(term75731, term75731.getClass(), "lastRomVersion", "zIPJJJubgX");
        setField(term75731, term75731.getClass(), "lastDataVersion", "WRbxmSFTaO");
        setIntField(term75937, term75937.getClass(), "year", 2024);
        setShortField(term75937, term75937.getClass(), "month", (short) 5);
        setShortField(term75937, term75937.getClass(), "day", (short) 28);
        setField(term75936, term75936.getClass(), "date", term75937);
        setByteField(term75941, term75941.getClass(), "hour", (byte) 15);
        setByteField(term75941, term75941.getClass(), "minute", (byte) 17);
        setByteField(term75941, term75941.getClass(), "second", (byte) 52);
        setIntField(term75941, term75941.getClass(), "nano", 650019774);
        setField(term75936, term75936.getClass(), "time", term75941);
        setField(term75731, term75731.getClass(), "lastPlayDate", term75936);
        setIntField(term75731, term75731.getClass(), "lastPlaceId", -1432735615);
        setField(term75731, term75731.getClass(), "lastPlaceName", "ZekQCuvPXT");
        setField(term75731, term75731.getClass(), "lastRegionId", "GUXdlpmVNQ");
        setField(term75731, term75731.getClass(), "lastRegionName", "QxSwOpnogl");
        setField(term75731, term75731.getClass(), "lastAllNetId", "wXeTrDfRqa");
        setField(term75731, term75731.getClass(), "lastClientId", "QsFsmwqvwM");
        setField(term75729, term75729.getClass(), "user", term75731);
        setIntField(term75729, term75729.getClass(), "duelId", 472705336);
        setIntField(term75729, term75729.getClass(), "progress", 988659735);
        setIntField(term75729, term75729.getClass(), "point", 1481448478);
        setBooleanField(term75729, term75729.getClass(), "isClear", false);
        setIntField(term76012, term76012.getClass(), "year", 2028);
        setShortField(term76012, term76012.getClass(), "month", (short) 12);
        setShortField(term76012, term76012.getClass(), "day", (short) 5);
        setField(term76011, term76011.getClass(), "date", term76012);
        setByteField(term76016, term76016.getClass(), "hour", (byte) 0);
        setByteField(term76016, term76016.getClass(), "minute", (byte) 31);
        setByteField(term76016, term76016.getClass(), "second", (byte) 47);
        setIntField(term76016, term76016.getClass(), "nano", 889672113);
        setField(term76011, term76011.getClass(), "time", term76016);
        setField(term75729, term75729.getClass(), "lastPlayDate", term76011);
        setIntField(term75729, term75729.getClass(), "param1", 598259983);
        setIntField(term75729, term75729.getClass(), "param2", 283054332);
        setIntField(term75729, term75729.getClass(), "param3", 627879820);
        setIntField(term75729, term75729.getClass(), "param4", -40238432);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserDuel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUser", argTypes, term75729, args);
    }

};


