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
import java.lang.Boolean;

public class UserPlaylog_setAllPerfect_140848451196 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term158175;
     Object term158487;

    public UserPlaylog_setAllPerfect_140848451196() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term158181 = new Long(970120292495348028L);
        term158175 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term158177 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term158179 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term158195 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term158196 = newInstance(Class.forName("java.time.LocalDate"));
        Object term158200 = newInstance(Class.forName("java.time.LocalTime"));
        Object term158205 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term158206 = newInstance(Class.forName("java.time.LocalDate"));
        Object term158210 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term158175, term158175.getClass(), "id", -3359440850156242734L);
        setLongField(term158177, term158177.getClass(), "id", -8891224677821082964L);
        setLongField(term158179, term158179.getClass(), "id", 673942798641120020L);
        setField(term158179, term158179.getClass(), "extId", term158181);
        setField(term158179, term158179.getClass(), "luid", "QZpJmHsqng");
        setIntField(term158196, term158196.getClass(), "year", 2013);
        setShortField(term158196, term158196.getClass(), "month", (short) 9);
        setShortField(term158196, term158196.getClass(), "day", (short) 18);
        setField(term158195, term158195.getClass(), "date", term158196);
        setByteField(term158200, term158200.getClass(), "hour", (byte) 0);
        setByteField(term158200, term158200.getClass(), "minute", (byte) 40);
        setByteField(term158200, term158200.getClass(), "second", (byte) 5);
        setIntField(term158200, term158200.getClass(), "nano", 735661180);
        setField(term158195, term158195.getClass(), "time", term158200);
        setField(term158179, term158179.getClass(), "registerTime", term158195);
        setIntField(term158206, term158206.getClass(), "year", 2024);
        setShortField(term158206, term158206.getClass(), "month", (short) 4);
        setShortField(term158206, term158206.getClass(), "day", (short) 18);
        setField(term158205, term158205.getClass(), "date", term158206);
        setByteField(term158210, term158210.getClass(), "hour", (byte) 16);
        setByteField(term158210, term158210.getClass(), "minute", (byte) 24);
        setByteField(term158210, term158210.getClass(), "second", (byte) 38);
        setIntField(term158210, term158210.getClass(), "nano", 339757581);
        setField(term158205, term158205.getClass(), "time", term158210);
        setField(term158179, term158179.getClass(), "accessTime", term158205);
        setField(term158177, term158177.getClass(), "card", term158179);
        setIntField(term158177, term158177.getClass(), "lastDataVersion", -874654273);
        setField(term158177, term158177.getClass(), "userName", "HrbrOZKvDm");
        setIntField(term158177, term158177.getClass(), "point", 1325634384);
        setIntField(term158177, term158177.getClass(), "totalPoint", 129241207);
        setIntField(term158177, term158177.getClass(), "iconId", 782825646);
        setIntField(term158177, term158177.getClass(), "nameplateId", 1592590302);
        setIntField(term158177, term158177.getClass(), "frameId", 1909858470);
        setIntField(term158177, term158177.getClass(), "trophyId", 127566139);
        setIntField(term158177, term158177.getClass(), "playCount", -571748060);
        setIntField(term158177, term158177.getClass(), "playVsCount", 823958755);
        setIntField(term158177, term158177.getClass(), "playSyncCount", 755047567);
        setIntField(term158177, term158177.getClass(), "winCount", -1510543479);
        setIntField(term158177, term158177.getClass(), "helpCount", 1327940241);
        setIntField(term158177, term158177.getClass(), "comboCount", -2102252492);
        setIntField(term158177, term158177.getClass(), "feverCount", -765611155);
        setIntField(term158177, term158177.getClass(), "totalHiScore", 2013921856);
        setIntField(term158177, term158177.getClass(), "totalEasyHighScore", 1111507238);
        setIntField(term158177, term158177.getClass(), "totalBasicHighScore", 45638925);
        setIntField(term158177, term158177.getClass(), "totalAdvancedHighScore", 245296907);
        setIntField(term158177, term158177.getClass(), "totalExpertHighScore", -1661022394);
        setIntField(term158177, term158177.getClass(), "totalMasterHighScore", 387503969);
        setIntField(term158177, term158177.getClass(), "totalReMasterHighScore", -1202736660);
        setIntField(term158177, term158177.getClass(), "totalHighSync", 128063546);
        setIntField(term158177, term158177.getClass(), "totalEasySync", 708796296);
        setIntField(term158177, term158177.getClass(), "totalBasicSync", 131265477);
        setIntField(term158177, term158177.getClass(), "totalAdvancedSync", 268467759);
        setIntField(term158177, term158177.getClass(), "totalExpertSync", -982835812);
        setIntField(term158177, term158177.getClass(), "totalMasterSync", 1186918206);
        setIntField(term158177, term158177.getClass(), "totalReMasterSync", -1277338163);
        setIntField(term158177, term158177.getClass(), "playerRating", -583910918);
        setIntField(term158177, term158177.getClass(), "highestRating", 226497471);
        setIntField(term158177, term158177.getClass(), "rankAuthTailId", 812740211);
        setField(term158177, term158177.getClass(), "eventWatchedDate", "UnnFJFliAk");
        setField(term158177, term158177.getClass(), "webLimitDate", "PgCubdnsfU");
        setIntField(term158177, term158177.getClass(), "challengeTrackPhase", -1023703523);
        setIntField(term158177, term158177.getClass(), "firstPlayBits", 1152661598);
        setField(term158177, term158177.getClass(), "lastPlayDate", "kwWeMEsLiI");
        setIntField(term158177, term158177.getClass(), "lastPlaceId", 938746477);
        setField(term158177, term158177.getClass(), "lastPlaceName", "kVRWVcbDmx");
        setIntField(term158177, term158177.getClass(), "lastRegionId", 1687946692);
        setField(term158177, term158177.getClass(), "lastRegionName", "jTuotqEcZK");
        setField(term158177, term158177.getClass(), "lastClientId", "wddQtFrWId");
        setField(term158177, term158177.getClass(), "lastCountryCode", "aHuJsHVnrv");
        setIntField(term158177, term158177.getClass(), "eventPoint", -1014618629);
        setIntField(term158177, term158177.getClass(), "totalLv", 74697655);
        setIntField(term158177, term158177.getClass(), "lastLoginBonusDay", 967013185);
        setIntField(term158177, term158177.getClass(), "lastSurvivalBonusDay", 472032103);
        setIntField(term158177, term158177.getClass(), "loginBonusLv", 1003610620);
        setField(term158175, term158175.getClass(), "user", term158177);
        setIntField(term158175, term158175.getClass(), "orderId", 676152405);
        setLongField(term158175, term158175.getClass(), "sortNumber", 2453638512947169594L);
        setIntField(term158175, term158175.getClass(), "placeId", 1562834301);
        setField(term158175, term158175.getClass(), "placeName", "kNaBBhwssd");
        setField(term158175, term158175.getClass(), "country", "zqGoMwjPjA");
        setIntField(term158175, term158175.getClass(), "regionId", 1823659119);
        setField(term158175, term158175.getClass(), "playDate", "qvrLYIqpRM");
        setField(term158175, term158175.getClass(), "userPlayDate", "IoPixEbkAS");
        setIntField(term158175, term158175.getClass(), "musicId", -1957633022);
        setIntField(term158175, term158175.getClass(), "level", -1701071523);
        setIntField(term158175, term158175.getClass(), "gameMode", 891292443);
        setIntField(term158175, term158175.getClass(), "rivalNum", 1458335309);
        setIntField(term158175, term158175.getClass(), "track", 937402469);
        setIntField(term158175, term158175.getClass(), "eventId", -351951887);
        setBooleanField(term158175, term158175.getClass(), "isFreeToPlay", false);
        setIntField(term158175, term158175.getClass(), "playerRating", -739675359);
        setLongField(term158175, term158175.getClass(), "playedUserId1", -6286554265404073084L);
        setField(term158175, term158175.getClass(), "playedUserName1", "aUBGFyjAFZ");
        setIntField(term158175, term158175.getClass(), "playedMusicLevel1", 1286392985);
        setLongField(term158175, term158175.getClass(), "playedUserId2", -1789728735275535628L);
        setField(term158175, term158175.getClass(), "playedUserName2", "hLGRczvgrI");
        setIntField(term158175, term158175.getClass(), "playedMusicLevel2", -1644414353);
        setLongField(term158175, term158175.getClass(), "playedUserId3", 9165671796313176705L);
        setField(term158175, term158175.getClass(), "playedUserName3", "ENiUwgffeV");
        setIntField(term158175, term158175.getClass(), "playedMusicLevel3", 1296237710);
        setIntField(term158175, term158175.getClass(), "achievement", 2008810809);
        setIntField(term158175, term158175.getClass(), "score", -1045846254);
        setIntField(term158175, term158175.getClass(), "tapScore", 1655389198);
        setIntField(term158175, term158175.getClass(), "holdScore", 108735158);
        setIntField(term158175, term158175.getClass(), "slideScore", -1540681088);
        setIntField(term158175, term158175.getClass(), "breakScore", -539704349);
        setIntField(term158175, term158175.getClass(), "syncRate", 583242948);
        setIntField(term158175, term158175.getClass(), "vsWin", -123760946);
        setBooleanField(term158175, term158175.getClass(), "isAllPerfect", false);
        setIntField(term158175, term158175.getClass(), "fullCombo", 734363550);
        setIntField(term158175, term158175.getClass(), "maxFever", -1059976664);
        setIntField(term158175, term158175.getClass(), "maxCombo", -2004413471);
        setIntField(term158175, term158175.getClass(), "tapPerfect", -1844277688);
        setIntField(term158175, term158175.getClass(), "tapGreat", 1676012566);
        setIntField(term158175, term158175.getClass(), "tapGood", -1705133905);
        setIntField(term158175, term158175.getClass(), "tapBad", 2097926644);
        setIntField(term158175, term158175.getClass(), "holdPerfect", 1530366468);
        setIntField(term158175, term158175.getClass(), "holdGreat", -1567786274);
        setIntField(term158175, term158175.getClass(), "holdGood", 622380290);
        setIntField(term158175, term158175.getClass(), "holdBad", -1706148481);
        setIntField(term158175, term158175.getClass(), "slidePerfect", -1921251597);
        setIntField(term158175, term158175.getClass(), "slideGreat", 264900657);
        setIntField(term158175, term158175.getClass(), "slideGood", 2014160549);
        setIntField(term158175, term158175.getClass(), "slideBad", 1275772649);
        setIntField(term158175, term158175.getClass(), "breakPerfect", 1447015677);
        setIntField(term158175, term158175.getClass(), "breakGreat", -1428023132);
        setIntField(term158175, term158175.getClass(), "breakGood", 1872761499);
        setIntField(term158175, term158175.getClass(), "breakBad", 1543055288);
        setBooleanField(term158175, term158175.getClass(), "isTrackSkip", false);
        setBooleanField(term158175, term158175.getClass(), "isHighScore", false);
        setBooleanField(term158175, term158175.getClass(), "isChallengeTrack", true);
        setIntField(term158175, term158175.getClass(), "challengeLife", -1912897500);
        setIntField(term158175, term158175.getClass(), "challengeRemain", 1686973815);
        setIntField(term158175, term158175.getClass(), "isAllPerfectPlus", 280914735);
        term158487 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term158487;
        callMethod(klass, "setAllPerfect", argTypes, term158175, args);
    }

};


