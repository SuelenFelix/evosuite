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

public class UserMusicDetail_setScoreRank_29002398936 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term104095;
     Object term104389;

    public UserMusicDetail_setScoreRank_29002398936() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term104101 = new Long(8540994973773607992L);
        term104095 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMusicDetail"));
        Object term104097 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term104099 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term104115 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term104116 = newInstance(Class.forName("java.time.LocalDate"));
        Object term104120 = newInstance(Class.forName("java.time.LocalTime"));
        Object term104125 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term104126 = newInstance(Class.forName("java.time.LocalDate"));
        Object term104130 = newInstance(Class.forName("java.time.LocalTime"));
        Object term104147 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term104148 = newInstance(Class.forName("java.time.LocalDate"));
        Object term104152 = newInstance(Class.forName("java.time.LocalTime"));
        Object term104208 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term104209 = newInstance(Class.forName("java.time.LocalDate"));
        Object term104213 = newInstance(Class.forName("java.time.LocalTime"));
        Object term104256 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term104257 = newInstance(Class.forName("java.time.LocalDate"));
        Object term104261 = newInstance(Class.forName("java.time.LocalTime"));
        Object term104302 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term104303 = newInstance(Class.forName("java.time.LocalDate"));
        Object term104307 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term104095, term104095.getClass(), "id", 3612026645709034896L);
        setLongField(term104097, term104097.getClass(), "id", -8767451917246862609L);
        setLongField(term104099, term104099.getClass(), "id", 1886820706698769775L);
        setField(term104099, term104099.getClass(), "extId", term104101);
        setField(term104099, term104099.getClass(), "luid", "KESrHnsKCa");
        setIntField(term104116, term104116.getClass(), "year", 2024);
        setShortField(term104116, term104116.getClass(), "month", (short) 1);
        setShortField(term104116, term104116.getClass(), "day", (short) 16);
        setField(term104115, term104115.getClass(), "date", term104116);
        setByteField(term104120, term104120.getClass(), "hour", (byte) 19);
        setByteField(term104120, term104120.getClass(), "minute", (byte) 24);
        setByteField(term104120, term104120.getClass(), "second", (byte) 37);
        setIntField(term104120, term104120.getClass(), "nano", 310724537);
        setField(term104115, term104115.getClass(), "time", term104120);
        setField(term104099, term104099.getClass(), "registerTime", term104115);
        setIntField(term104126, term104126.getClass(), "year", 2018);
        setShortField(term104126, term104126.getClass(), "month", (short) 1);
        setShortField(term104126, term104126.getClass(), "day", (short) 11);
        setField(term104125, term104125.getClass(), "date", term104126);
        setByteField(term104130, term104130.getClass(), "hour", (byte) 22);
        setByteField(term104130, term104130.getClass(), "minute", (byte) 49);
        setByteField(term104130, term104130.getClass(), "second", (byte) 21);
        setIntField(term104130, term104130.getClass(), "nano", 384803149);
        setField(term104125, term104125.getClass(), "time", term104130);
        setField(term104099, term104099.getClass(), "accessTime", term104125);
        setField(term104097, term104097.getClass(), "card", term104099);
        setField(term104097, term104097.getClass(), "userName", "PRagOHCKmN");
        setIntField(term104148, term104148.getClass(), "year", 2012);
        setShortField(term104148, term104148.getClass(), "month", (short) 11);
        setShortField(term104148, term104148.getClass(), "day", (short) 28);
        setField(term104147, term104147.getClass(), "date", term104148);
        setByteField(term104152, term104152.getClass(), "hour", (byte) 19);
        setByteField(term104152, term104152.getClass(), "minute", (byte) 18);
        setByteField(term104152, term104152.getClass(), "second", (byte) 3);
        setIntField(term104152, term104152.getClass(), "nano", 323457154);
        setField(term104147, term104147.getClass(), "time", term104152);
        setField(term104097, term104097.getClass(), "lastLoginDate", term104147);
        setBooleanField(term104097, term104097.getClass(), "isWebJoin", true);
        setField(term104097, term104097.getClass(), "webLimitDate", "lvnwgMKxXk");
        setIntField(term104097, term104097.getClass(), "level", -358856964);
        setIntField(term104097, term104097.getClass(), "reincarnationNum", -367287466);
        setField(term104097, term104097.getClass(), "exp", "FiSaNxpGPk");
        setLongField(term104097, term104097.getClass(), "point", 8154151569172957467L);
        setLongField(term104097, term104097.getClass(), "totalPoint", -1835390437836814514L);
        setIntField(term104097, term104097.getClass(), "playCount", 784852065);
        setIntField(term104097, term104097.getClass(), "multiPlayCount", 358212017);
        setIntField(term104097, term104097.getClass(), "multiWinCount", -1993296712);
        setIntField(term104097, term104097.getClass(), "requestResCount", -1609787368);
        setIntField(term104097, term104097.getClass(), "acceptResCount", -1900357855);
        setIntField(term104097, term104097.getClass(), "successResCount", 1044601336);
        setIntField(term104097, term104097.getClass(), "playerRating", 562228242);
        setIntField(term104097, term104097.getClass(), "highestRating", 995283566);
        setIntField(term104097, term104097.getClass(), "nameplateId", 1311217437);
        setIntField(term104097, term104097.getClass(), "frameId", 289716613);
        setIntField(term104097, term104097.getClass(), "characterId", 2114806182);
        setIntField(term104097, term104097.getClass(), "trophyId", 41155687);
        setIntField(term104097, term104097.getClass(), "playedTutorialBit", 1224581311);
        setIntField(term104097, term104097.getClass(), "firstTutorialCancelNum", 1017569554);
        setIntField(term104097, term104097.getClass(), "masterTutorialCancelNum", -1457930793);
        setIntField(term104097, term104097.getClass(), "totalRepertoireCount", -1761017199);
        setIntField(term104097, term104097.getClass(), "totalMapNum", -1171889960);
        setLongField(term104097, term104097.getClass(), "totalHiScore", 5164274630708382393L);
        setLongField(term104097, term104097.getClass(), "totalBasicHighScore", 4110746064383978605L);
        setLongField(term104097, term104097.getClass(), "totalAdvancedHighScore", 6102098033693999355L);
        setLongField(term104097, term104097.getClass(), "totalExpertHighScore", -3823857953281104599L);
        setLongField(term104097, term104097.getClass(), "totalMasterHighScore", 7198604597199389645L);
        setIntField(term104209, term104209.getClass(), "year", 2020);
        setShortField(term104209, term104209.getClass(), "month", (short) 9);
        setShortField(term104209, term104209.getClass(), "day", (short) 1);
        setField(term104208, term104208.getClass(), "date", term104209);
        setByteField(term104213, term104213.getClass(), "hour", (byte) 22);
        setByteField(term104213, term104213.getClass(), "minute", (byte) 39);
        setByteField(term104213, term104213.getClass(), "second", (byte) 14);
        setIntField(term104213, term104213.getClass(), "nano", 306720874);
        setField(term104208, term104208.getClass(), "time", term104213);
        setField(term104097, term104097.getClass(), "eventWatchedDate", term104208);
        setIntField(term104097, term104097.getClass(), "friendCount", -708194098);
        setBooleanField(term104097, term104097.getClass(), "isMaimai", true);
        setField(term104097, term104097.getClass(), "firstGameId", "QMzQRRhneO");
        setField(term104097, term104097.getClass(), "firstRomVersion", "VFWNaQoDnL");
        setField(term104097, term104097.getClass(), "firstDataVersion", "BFwtIJkozx");
        setIntField(term104257, term104257.getClass(), "year", 2026);
        setShortField(term104257, term104257.getClass(), "month", (short) 5);
        setShortField(term104257, term104257.getClass(), "day", (short) 27);
        setField(term104256, term104256.getClass(), "date", term104257);
        setByteField(term104261, term104261.getClass(), "hour", (byte) 17);
        setByteField(term104261, term104261.getClass(), "minute", (byte) 53);
        setByteField(term104261, term104261.getClass(), "second", (byte) 50);
        setIntField(term104261, term104261.getClass(), "nano", 28025394);
        setField(term104256, term104256.getClass(), "time", term104261);
        setField(term104097, term104097.getClass(), "firstPlayDate", term104256);
        setField(term104097, term104097.getClass(), "lastGameId", "cIMeTiVeEp");
        setField(term104097, term104097.getClass(), "lastRomVersion", "aUqkaiSINd");
        setField(term104097, term104097.getClass(), "lastDataVersion", "IVtVcsDYoX");
        setIntField(term104303, term104303.getClass(), "year", 2021);
        setShortField(term104303, term104303.getClass(), "month", (short) 8);
        setShortField(term104303, term104303.getClass(), "day", (short) 12);
        setField(term104302, term104302.getClass(), "date", term104303);
        setByteField(term104307, term104307.getClass(), "hour", (byte) 2);
        setByteField(term104307, term104307.getClass(), "minute", (byte) 55);
        setByteField(term104307, term104307.getClass(), "second", (byte) 38);
        setIntField(term104307, term104307.getClass(), "nano", 881864768);
        setField(term104302, term104302.getClass(), "time", term104307);
        setField(term104097, term104097.getClass(), "lastPlayDate", term104302);
        setIntField(term104097, term104097.getClass(), "lastPlaceId", 613501922);
        setField(term104097, term104097.getClass(), "lastPlaceName", "GgQFLRdyzF");
        setField(term104097, term104097.getClass(), "lastRegionId", "irKkxyVwDT");
        setField(term104097, term104097.getClass(), "lastRegionName", "vCUIiQSkZO");
        setField(term104097, term104097.getClass(), "lastAllNetId", "oAVrawlRsA");
        setField(term104097, term104097.getClass(), "lastClientId", "jVdmaiSLFy");
        setField(term104095, term104095.getClass(), "user", term104097);
        setIntField(term104095, term104095.getClass(), "musicId", -1145481353);
        setIntField(term104095, term104095.getClass(), "level", -69628972);
        setIntField(term104095, term104095.getClass(), "playCount", 2136375684);
        setIntField(term104095, term104095.getClass(), "scoreMax", 1534903857);
        setIntField(term104095, term104095.getClass(), "resRequestCount", -1364694166);
        setIntField(term104095, term104095.getClass(), "resAcceptCount", -1031588818);
        setIntField(term104095, term104095.getClass(), "resSuccessCount", -2142065668);
        setIntField(term104095, term104095.getClass(), "missCount", -1027337235);
        setIntField(term104095, term104095.getClass(), "maxComboCount", 2078039172);
        setBooleanField(term104095, term104095.getClass(), "isFullCombo", true);
        setBooleanField(term104095, term104095.getClass(), "isAllJustice", true);
        setBooleanField(term104095, term104095.getClass(), "isSuccess", false);
        setIntField(term104095, term104095.getClass(), "fullChain", 810570789);
        setIntField(term104095, term104095.getClass(), "maxChain", 1688150689);
        setIntField(term104095, term104095.getClass(), "scoreRank", -1900819498);
        setBooleanField(term104095, term104095.getClass(), "isLock", false);
        term104389 = new Integer(-1374608663);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term104389;
        callMethod(klass, "setScoreRank", argTypes, term104095, args);
    }

};


