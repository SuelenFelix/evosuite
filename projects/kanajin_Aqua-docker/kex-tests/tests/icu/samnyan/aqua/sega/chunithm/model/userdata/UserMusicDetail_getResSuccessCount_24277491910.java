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

public class UserMusicDetail_getResSuccessCount_24277491910 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term92095;

    public UserMusicDetail_getResSuccessCount_24277491910() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term92101 = new Long(-3730936709704460408L);
        term92095 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMusicDetail"));
        Object term92097 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term92099 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term92115 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term92116 = newInstance(Class.forName("java.time.LocalDate"));
        Object term92120 = newInstance(Class.forName("java.time.LocalTime"));
        Object term92125 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term92126 = newInstance(Class.forName("java.time.LocalDate"));
        Object term92130 = newInstance(Class.forName("java.time.LocalTime"));
        Object term92147 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term92148 = newInstance(Class.forName("java.time.LocalDate"));
        Object term92152 = newInstance(Class.forName("java.time.LocalTime"));
        Object term92208 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term92209 = newInstance(Class.forName("java.time.LocalDate"));
        Object term92213 = newInstance(Class.forName("java.time.LocalTime"));
        Object term92256 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term92257 = newInstance(Class.forName("java.time.LocalDate"));
        Object term92261 = newInstance(Class.forName("java.time.LocalTime"));
        Object term92302 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term92303 = newInstance(Class.forName("java.time.LocalDate"));
        Object term92307 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term92095, term92095.getClass(), "id", 2225205033924782338L);
        setLongField(term92097, term92097.getClass(), "id", 7835393778718147329L);
        setLongField(term92099, term92099.getClass(), "id", 2629509803227198743L);
        setField(term92099, term92099.getClass(), "extId", term92101);
        setField(term92099, term92099.getClass(), "luid", "fmecFLYSIi");
        setIntField(term92116, term92116.getClass(), "year", 2025);
        setShortField(term92116, term92116.getClass(), "month", (short) 12);
        setShortField(term92116, term92116.getClass(), "day", (short) 14);
        setField(term92115, term92115.getClass(), "date", term92116);
        setByteField(term92120, term92120.getClass(), "hour", (byte) 1);
        setByteField(term92120, term92120.getClass(), "minute", (byte) 23);
        setByteField(term92120, term92120.getClass(), "second", (byte) 11);
        setIntField(term92120, term92120.getClass(), "nano", 960271904);
        setField(term92115, term92115.getClass(), "time", term92120);
        setField(term92099, term92099.getClass(), "registerTime", term92115);
        setIntField(term92126, term92126.getClass(), "year", 2012);
        setShortField(term92126, term92126.getClass(), "month", (short) 7);
        setShortField(term92126, term92126.getClass(), "day", (short) 22);
        setField(term92125, term92125.getClass(), "date", term92126);
        setByteField(term92130, term92130.getClass(), "hour", (byte) 6);
        setByteField(term92130, term92130.getClass(), "minute", (byte) 13);
        setByteField(term92130, term92130.getClass(), "second", (byte) 54);
        setIntField(term92130, term92130.getClass(), "nano", 382913207);
        setField(term92125, term92125.getClass(), "time", term92130);
        setField(term92099, term92099.getClass(), "accessTime", term92125);
        setField(term92097, term92097.getClass(), "card", term92099);
        setField(term92097, term92097.getClass(), "userName", "bjjsWtQeyp");
        setIntField(term92148, term92148.getClass(), "year", 2019);
        setShortField(term92148, term92148.getClass(), "month", (short) 7);
        setShortField(term92148, term92148.getClass(), "day", (short) 11);
        setField(term92147, term92147.getClass(), "date", term92148);
        setByteField(term92152, term92152.getClass(), "hour", (byte) 4);
        setByteField(term92152, term92152.getClass(), "minute", (byte) 58);
        setByteField(term92152, term92152.getClass(), "second", (byte) 37);
        setIntField(term92152, term92152.getClass(), "nano", 720823015);
        setField(term92147, term92147.getClass(), "time", term92152);
        setField(term92097, term92097.getClass(), "lastLoginDate", term92147);
        setBooleanField(term92097, term92097.getClass(), "isWebJoin", false);
        setField(term92097, term92097.getClass(), "webLimitDate", "CoPgTYdcst");
        setIntField(term92097, term92097.getClass(), "level", -164198746);
        setIntField(term92097, term92097.getClass(), "reincarnationNum", -335778340);
        setField(term92097, term92097.getClass(), "exp", "UYWsaWaOUS");
        setLongField(term92097, term92097.getClass(), "point", -8008739907583786665L);
        setLongField(term92097, term92097.getClass(), "totalPoint", -7262010620280836353L);
        setIntField(term92097, term92097.getClass(), "playCount", 1446088650);
        setIntField(term92097, term92097.getClass(), "multiPlayCount", 1275760441);
        setIntField(term92097, term92097.getClass(), "multiWinCount", 1486085635);
        setIntField(term92097, term92097.getClass(), "requestResCount", -2029499473);
        setIntField(term92097, term92097.getClass(), "acceptResCount", 543873732);
        setIntField(term92097, term92097.getClass(), "successResCount", -214745694);
        setIntField(term92097, term92097.getClass(), "playerRating", -18584549);
        setIntField(term92097, term92097.getClass(), "highestRating", -1678828778);
        setIntField(term92097, term92097.getClass(), "nameplateId", 1466641302);
        setIntField(term92097, term92097.getClass(), "frameId", -365255901);
        setIntField(term92097, term92097.getClass(), "characterId", -1861629783);
        setIntField(term92097, term92097.getClass(), "trophyId", 1512542473);
        setIntField(term92097, term92097.getClass(), "playedTutorialBit", 395474596);
        setIntField(term92097, term92097.getClass(), "firstTutorialCancelNum", -181917615);
        setIntField(term92097, term92097.getClass(), "masterTutorialCancelNum", -175990400);
        setIntField(term92097, term92097.getClass(), "totalRepertoireCount", -1756176486);
        setIntField(term92097, term92097.getClass(), "totalMapNum", -1049589248);
        setLongField(term92097, term92097.getClass(), "totalHiScore", -7722734066534066354L);
        setLongField(term92097, term92097.getClass(), "totalBasicHighScore", -644547147296685723L);
        setLongField(term92097, term92097.getClass(), "totalAdvancedHighScore", 2771276802933392082L);
        setLongField(term92097, term92097.getClass(), "totalExpertHighScore", 9159382852866553531L);
        setLongField(term92097, term92097.getClass(), "totalMasterHighScore", 308309058288153545L);
        setIntField(term92209, term92209.getClass(), "year", 2027);
        setShortField(term92209, term92209.getClass(), "month", (short) 5);
        setShortField(term92209, term92209.getClass(), "day", (short) 22);
        setField(term92208, term92208.getClass(), "date", term92209);
        setByteField(term92213, term92213.getClass(), "hour", (byte) 8);
        setByteField(term92213, term92213.getClass(), "minute", (byte) 11);
        setByteField(term92213, term92213.getClass(), "second", (byte) 11);
        setIntField(term92213, term92213.getClass(), "nano", 904541874);
        setField(term92208, term92208.getClass(), "time", term92213);
        setField(term92097, term92097.getClass(), "eventWatchedDate", term92208);
        setIntField(term92097, term92097.getClass(), "friendCount", 120294405);
        setBooleanField(term92097, term92097.getClass(), "isMaimai", false);
        setField(term92097, term92097.getClass(), "firstGameId", "oOxKzvqxUJ");
        setField(term92097, term92097.getClass(), "firstRomVersion", "tjqgiPrtgj");
        setField(term92097, term92097.getClass(), "firstDataVersion", "atajdBiCpk");
        setIntField(term92257, term92257.getClass(), "year", 2012);
        setShortField(term92257, term92257.getClass(), "month", (short) 11);
        setShortField(term92257, term92257.getClass(), "day", (short) 1);
        setField(term92256, term92256.getClass(), "date", term92257);
        setByteField(term92261, term92261.getClass(), "hour", (byte) 8);
        setByteField(term92261, term92261.getClass(), "minute", (byte) 55);
        setByteField(term92261, term92261.getClass(), "second", (byte) 17);
        setIntField(term92261, term92261.getClass(), "nano", 9669014);
        setField(term92256, term92256.getClass(), "time", term92261);
        setField(term92097, term92097.getClass(), "firstPlayDate", term92256);
        setField(term92097, term92097.getClass(), "lastGameId", "iZkNHOfNWw");
        setField(term92097, term92097.getClass(), "lastRomVersion", "SxvlCppquX");
        setField(term92097, term92097.getClass(), "lastDataVersion", "KXtTCHHVWr");
        setIntField(term92303, term92303.getClass(), "year", 2019);
        setShortField(term92303, term92303.getClass(), "month", (short) 2);
        setShortField(term92303, term92303.getClass(), "day", (short) 18);
        setField(term92302, term92302.getClass(), "date", term92303);
        setByteField(term92307, term92307.getClass(), "hour", (byte) 2);
        setByteField(term92307, term92307.getClass(), "minute", (byte) 58);
        setByteField(term92307, term92307.getClass(), "second", (byte) 45);
        setIntField(term92307, term92307.getClass(), "nano", 485835688);
        setField(term92302, term92302.getClass(), "time", term92307);
        setField(term92097, term92097.getClass(), "lastPlayDate", term92302);
        setIntField(term92097, term92097.getClass(), "lastPlaceId", 1525059844);
        setField(term92097, term92097.getClass(), "lastPlaceName", "ylbTmYKeKr");
        setField(term92097, term92097.getClass(), "lastRegionId", "iyKZenGXgC");
        setField(term92097, term92097.getClass(), "lastRegionName", "jgPUpbSRNf");
        setField(term92097, term92097.getClass(), "lastAllNetId", "GHKReaUGqB");
        setField(term92097, term92097.getClass(), "lastClientId", "oWFgLqbhiK");
        setField(term92095, term92095.getClass(), "user", term92097);
        setIntField(term92095, term92095.getClass(), "musicId", 1788101978);
        setIntField(term92095, term92095.getClass(), "level", -1324289284);
        setIntField(term92095, term92095.getClass(), "playCount", 2057345888);
        setIntField(term92095, term92095.getClass(), "scoreMax", -2072027172);
        setIntField(term92095, term92095.getClass(), "resRequestCount", 482848507);
        setIntField(term92095, term92095.getClass(), "resAcceptCount", -710465280);
        setIntField(term92095, term92095.getClass(), "resSuccessCount", -1488460274);
        setIntField(term92095, term92095.getClass(), "missCount", -653095451);
        setIntField(term92095, term92095.getClass(), "maxComboCount", 1716408118);
        setBooleanField(term92095, term92095.getClass(), "isFullCombo", false);
        setBooleanField(term92095, term92095.getClass(), "isAllJustice", false);
        setBooleanField(term92095, term92095.getClass(), "isSuccess", true);
        setIntField(term92095, term92095.getClass(), "fullChain", -1873669731);
        setIntField(term92095, term92095.getClass(), "maxChain", 2124411599);
        setIntField(term92095, term92095.getClass(), "scoreRank", -71602583);
        setBooleanField(term92095, term92095.getClass(), "isLock", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getResSuccessCount", argTypes, term92095, args);
    }

};


