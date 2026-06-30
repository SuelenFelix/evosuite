package icu.samnyan.aqua.sega.maimai.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class UserPlaylog_getTapGreat_32346316340 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term131271;

    public UserPlaylog_getTapGreat_32346316340() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term131277 = new Long(4012955251407483889L);
        term131271 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term131273 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term131275 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term131291 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term131292 = newInstance(Class.forName("java.time.LocalDate"));
        Object term131296 = newInstance(Class.forName("java.time.LocalTime"));
        Object term131301 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term131302 = newInstance(Class.forName("java.time.LocalDate"));
        Object term131306 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term131271, term131271.getClass(), "id", -1329447485805427573L);
        setLongField(term131273, term131273.getClass(), "id", -2298075900308676256L);
        setLongField(term131275, term131275.getClass(), "id", -32504336313564415L);
        setField(term131275, term131275.getClass(), "extId", term131277);
        setField(term131275, term131275.getClass(), "luid", "ulsJyRLpjn");
        setIntField(term131292, term131292.getClass(), "year", 2019);
        setShortField(term131292, term131292.getClass(), "month", (short) 10);
        setShortField(term131292, term131292.getClass(), "day", (short) 19);
        setField(term131291, term131291.getClass(), "date", term131292);
        setByteField(term131296, term131296.getClass(), "hour", (byte) 13);
        setByteField(term131296, term131296.getClass(), "minute", (byte) 22);
        setByteField(term131296, term131296.getClass(), "second", (byte) 53);
        setIntField(term131296, term131296.getClass(), "nano", 628070727);
        setField(term131291, term131291.getClass(), "time", term131296);
        setField(term131275, term131275.getClass(), "registerTime", term131291);
        setIntField(term131302, term131302.getClass(), "year", 2018);
        setShortField(term131302, term131302.getClass(), "month", (short) 3);
        setShortField(term131302, term131302.getClass(), "day", (short) 4);
        setField(term131301, term131301.getClass(), "date", term131302);
        setByteField(term131306, term131306.getClass(), "hour", (byte) 20);
        setByteField(term131306, term131306.getClass(), "minute", (byte) 47);
        setByteField(term131306, term131306.getClass(), "second", (byte) 55);
        setIntField(term131306, term131306.getClass(), "nano", 479898286);
        setField(term131301, term131301.getClass(), "time", term131306);
        setField(term131275, term131275.getClass(), "accessTime", term131301);
        setField(term131273, term131273.getClass(), "card", term131275);
        setIntField(term131273, term131273.getClass(), "lastDataVersion", -256116824);
        setField(term131273, term131273.getClass(), "userName", "mPvRCwfDas");
        setIntField(term131273, term131273.getClass(), "point", -124548665);
        setIntField(term131273, term131273.getClass(), "totalPoint", 1655508317);
        setIntField(term131273, term131273.getClass(), "iconId", -74173370);
        setIntField(term131273, term131273.getClass(), "nameplateId", -1760304154);
        setIntField(term131273, term131273.getClass(), "frameId", 107685809);
        setIntField(term131273, term131273.getClass(), "trophyId", 1946075579);
        setIntField(term131273, term131273.getClass(), "playCount", -1111915638);
        setIntField(term131273, term131273.getClass(), "playVsCount", 663576021);
        setIntField(term131273, term131273.getClass(), "playSyncCount", -1254576977);
        setIntField(term131273, term131273.getClass(), "winCount", -1258344496);
        setIntField(term131273, term131273.getClass(), "helpCount", -1827033542);
        setIntField(term131273, term131273.getClass(), "comboCount", -1247831869);
        setIntField(term131273, term131273.getClass(), "feverCount", 1449688423);
        setIntField(term131273, term131273.getClass(), "totalHiScore", -1845034925);
        setIntField(term131273, term131273.getClass(), "totalEasyHighScore", 994445695);
        setIntField(term131273, term131273.getClass(), "totalBasicHighScore", -492928823);
        setIntField(term131273, term131273.getClass(), "totalAdvancedHighScore", 1368633048);
        setIntField(term131273, term131273.getClass(), "totalExpertHighScore", -1444516296);
        setIntField(term131273, term131273.getClass(), "totalMasterHighScore", 308255845);
        setIntField(term131273, term131273.getClass(), "totalReMasterHighScore", -988334088);
        setIntField(term131273, term131273.getClass(), "totalHighSync", 1129188729);
        setIntField(term131273, term131273.getClass(), "totalEasySync", -751261444);
        setIntField(term131273, term131273.getClass(), "totalBasicSync", -1117817445);
        setIntField(term131273, term131273.getClass(), "totalAdvancedSync", 1230680785);
        setIntField(term131273, term131273.getClass(), "totalExpertSync", 1940583073);
        setIntField(term131273, term131273.getClass(), "totalMasterSync", 1524271170);
        setIntField(term131273, term131273.getClass(), "totalReMasterSync", 1281890678);
        setIntField(term131273, term131273.getClass(), "playerRating", -625924102);
        setIntField(term131273, term131273.getClass(), "highestRating", 695176233);
        setIntField(term131273, term131273.getClass(), "rankAuthTailId", -538942305);
        setField(term131273, term131273.getClass(), "eventWatchedDate", "XTbkEKEVGp");
        setField(term131273, term131273.getClass(), "webLimitDate", "cJBWpbUYku");
        setIntField(term131273, term131273.getClass(), "challengeTrackPhase", 2125548603);
        setIntField(term131273, term131273.getClass(), "firstPlayBits", -1792522449);
        setField(term131273, term131273.getClass(), "lastPlayDate", "FuPIwSZZLv");
        setIntField(term131273, term131273.getClass(), "lastPlaceId", 1697610319);
        setField(term131273, term131273.getClass(), "lastPlaceName", "IHnthsxNjP");
        setIntField(term131273, term131273.getClass(), "lastRegionId", -87021135);
        setField(term131273, term131273.getClass(), "lastRegionName", "AmuZWWgIan");
        setField(term131273, term131273.getClass(), "lastClientId", "niexDrHktN");
        setField(term131273, term131273.getClass(), "lastCountryCode", "zkKyhlpdHO");
        setIntField(term131273, term131273.getClass(), "eventPoint", 619691165);
        setIntField(term131273, term131273.getClass(), "totalLv", -124163210);
        setIntField(term131273, term131273.getClass(), "lastLoginBonusDay", 200992733);
        setIntField(term131273, term131273.getClass(), "lastSurvivalBonusDay", 1285682550);
        setIntField(term131273, term131273.getClass(), "loginBonusLv", -852602236);
        setField(term131271, term131271.getClass(), "user", term131273);
        setIntField(term131271, term131271.getClass(), "orderId", -442221418);
        setLongField(term131271, term131271.getClass(), "sortNumber", -3072149709226785130L);
        setIntField(term131271, term131271.getClass(), "placeId", 974356617);
        setField(term131271, term131271.getClass(), "placeName", "deRevaCteK");
        setField(term131271, term131271.getClass(), "country", "dVepDETefb");
        setIntField(term131271, term131271.getClass(), "regionId", 660265178);
        setField(term131271, term131271.getClass(), "playDate", "IVzSENeLxP");
        setField(term131271, term131271.getClass(), "userPlayDate", "XlXuNQwqYb");
        setIntField(term131271, term131271.getClass(), "musicId", 1982277135);
        setIntField(term131271, term131271.getClass(), "level", 405631945);
        setIntField(term131271, term131271.getClass(), "gameMode", -1114642017);
        setIntField(term131271, term131271.getClass(), "rivalNum", 322604433);
        setIntField(term131271, term131271.getClass(), "track", -863608100);
        setIntField(term131271, term131271.getClass(), "eventId", -809977936);
        setBooleanField(term131271, term131271.getClass(), "isFreeToPlay", false);
        setIntField(term131271, term131271.getClass(), "playerRating", -584343331);
        setLongField(term131271, term131271.getClass(), "playedUserId1", -539562950566320509L);
        setField(term131271, term131271.getClass(), "playedUserName1", "ePtDnXODVc");
        setIntField(term131271, term131271.getClass(), "playedMusicLevel1", 1773024551);
        setLongField(term131271, term131271.getClass(), "playedUserId2", -6590502822258678292L);
        setField(term131271, term131271.getClass(), "playedUserName2", "NupNPsPxZu");
        setIntField(term131271, term131271.getClass(), "playedMusicLevel2", -1168008314);
        setLongField(term131271, term131271.getClass(), "playedUserId3", 707619162419050395L);
        setField(term131271, term131271.getClass(), "playedUserName3", "bOTZrbSitH");
        setIntField(term131271, term131271.getClass(), "playedMusicLevel3", -1880112250);
        setIntField(term131271, term131271.getClass(), "achievement", -84187747);
        setIntField(term131271, term131271.getClass(), "score", -674794156);
        setIntField(term131271, term131271.getClass(), "tapScore", -321760913);
        setIntField(term131271, term131271.getClass(), "holdScore", -99070568);
        setIntField(term131271, term131271.getClass(), "slideScore", 597463097);
        setIntField(term131271, term131271.getClass(), "breakScore", 639141268);
        setIntField(term131271, term131271.getClass(), "syncRate", 2102047934);
        setIntField(term131271, term131271.getClass(), "vsWin", -2040700684);
        setBooleanField(term131271, term131271.getClass(), "isAllPerfect", false);
        setIntField(term131271, term131271.getClass(), "fullCombo", -1560806486);
        setIntField(term131271, term131271.getClass(), "maxFever", 1221263863);
        setIntField(term131271, term131271.getClass(), "maxCombo", -2144870229);
        setIntField(term131271, term131271.getClass(), "tapPerfect", 552083040);
        setIntField(term131271, term131271.getClass(), "tapGreat", -1642633870);
        setIntField(term131271, term131271.getClass(), "tapGood", -1311729867);
        setIntField(term131271, term131271.getClass(), "tapBad", -1200285703);
        setIntField(term131271, term131271.getClass(), "holdPerfect", 1578047630);
        setIntField(term131271, term131271.getClass(), "holdGreat", -266967108);
        setIntField(term131271, term131271.getClass(), "holdGood", -1251353595);
        setIntField(term131271, term131271.getClass(), "holdBad", -1106786876);
        setIntField(term131271, term131271.getClass(), "slidePerfect", -1985822835);
        setIntField(term131271, term131271.getClass(), "slideGreat", -47812160);
        setIntField(term131271, term131271.getClass(), "slideGood", -1473188946);
        setIntField(term131271, term131271.getClass(), "slideBad", 659834492);
        setIntField(term131271, term131271.getClass(), "breakPerfect", 1792053121);
        setIntField(term131271, term131271.getClass(), "breakGreat", 1546609260);
        setIntField(term131271, term131271.getClass(), "breakGood", 714773981);
        setIntField(term131271, term131271.getClass(), "breakBad", -1344815823);
        setBooleanField(term131271, term131271.getClass(), "isTrackSkip", true);
        setBooleanField(term131271, term131271.getClass(), "isHighScore", false);
        setBooleanField(term131271, term131271.getClass(), "isChallengeTrack", false);
        setIntField(term131271, term131271.getClass(), "challengeLife", 1199437462);
        setIntField(term131271, term131271.getClass(), "challengeRemain", -2079545024);
        setIntField(term131271, term131271.getClass(), "isAllPerfectPlus", -507889735);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTapGreat", argTypes, term131271, args);
    }

};


