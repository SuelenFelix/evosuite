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

public class UserPlaylog_toString_1288668204125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term171917;

    public UserPlaylog_toString_1288668204125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term171923 = new Long(-5714578622746827780L);
        term171917 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term171919 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term171921 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term171937 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term171938 = newInstance(Class.forName("java.time.LocalDate"));
        Object term171942 = newInstance(Class.forName("java.time.LocalTime"));
        Object term171947 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term171948 = newInstance(Class.forName("java.time.LocalDate"));
        Object term171952 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term171917, term171917.getClass(), "id", 1588756868689872678L);
        setLongField(term171919, term171919.getClass(), "id", 2841025204772034361L);
        setLongField(term171921, term171921.getClass(), "id", -6951863671075383168L);
        setField(term171921, term171921.getClass(), "extId", term171923);
        setField(term171921, term171921.getClass(), "luid", "rLgUagmMGn");
        setIntField(term171938, term171938.getClass(), "year", 2028);
        setShortField(term171938, term171938.getClass(), "month", (short) 4);
        setShortField(term171938, term171938.getClass(), "day", (short) 3);
        setField(term171937, term171937.getClass(), "date", term171938);
        setByteField(term171942, term171942.getClass(), "hour", (byte) 0);
        setByteField(term171942, term171942.getClass(), "minute", (byte) 28);
        setByteField(term171942, term171942.getClass(), "second", (byte) 50);
        setIntField(term171942, term171942.getClass(), "nano", 521054025);
        setField(term171937, term171937.getClass(), "time", term171942);
        setField(term171921, term171921.getClass(), "registerTime", term171937);
        setIntField(term171948, term171948.getClass(), "year", 2012);
        setShortField(term171948, term171948.getClass(), "month", (short) 11);
        setShortField(term171948, term171948.getClass(), "day", (short) 12);
        setField(term171947, term171947.getClass(), "date", term171948);
        setByteField(term171952, term171952.getClass(), "hour", (byte) 2);
        setByteField(term171952, term171952.getClass(), "minute", (byte) 45);
        setByteField(term171952, term171952.getClass(), "second", (byte) 14);
        setIntField(term171952, term171952.getClass(), "nano", 572497850);
        setField(term171947, term171947.getClass(), "time", term171952);
        setField(term171921, term171921.getClass(), "accessTime", term171947);
        setField(term171919, term171919.getClass(), "card", term171921);
        setIntField(term171919, term171919.getClass(), "lastDataVersion", 324849221);
        setField(term171919, term171919.getClass(), "userName", "EZlpBOXfGZ");
        setIntField(term171919, term171919.getClass(), "point", -1571533700);
        setIntField(term171919, term171919.getClass(), "totalPoint", 561378403);
        setIntField(term171919, term171919.getClass(), "iconId", -1409660659);
        setIntField(term171919, term171919.getClass(), "nameplateId", -877401788);
        setIntField(term171919, term171919.getClass(), "frameId", -1458113302);
        setIntField(term171919, term171919.getClass(), "trophyId", 938677709);
        setIntField(term171919, term171919.getClass(), "playCount", 1718240470);
        setIntField(term171919, term171919.getClass(), "playVsCount", -533520179);
        setIntField(term171919, term171919.getClass(), "playSyncCount", 717033111);
        setIntField(term171919, term171919.getClass(), "winCount", 1108523073);
        setIntField(term171919, term171919.getClass(), "helpCount", -1580188520);
        setIntField(term171919, term171919.getClass(), "comboCount", 2000542813);
        setIntField(term171919, term171919.getClass(), "feverCount", 1465453818);
        setIntField(term171919, term171919.getClass(), "totalHiScore", 1564787468);
        setIntField(term171919, term171919.getClass(), "totalEasyHighScore", 724156238);
        setIntField(term171919, term171919.getClass(), "totalBasicHighScore", 1529773068);
        setIntField(term171919, term171919.getClass(), "totalAdvancedHighScore", 1699081293);
        setIntField(term171919, term171919.getClass(), "totalExpertHighScore", -2022502187);
        setIntField(term171919, term171919.getClass(), "totalMasterHighScore", -1381763762);
        setIntField(term171919, term171919.getClass(), "totalReMasterHighScore", -1759657760);
        setIntField(term171919, term171919.getClass(), "totalHighSync", 2134512972);
        setIntField(term171919, term171919.getClass(), "totalEasySync", -430013932);
        setIntField(term171919, term171919.getClass(), "totalBasicSync", 1321251758);
        setIntField(term171919, term171919.getClass(), "totalAdvancedSync", -632822177);
        setIntField(term171919, term171919.getClass(), "totalExpertSync", -675399364);
        setIntField(term171919, term171919.getClass(), "totalMasterSync", 647381700);
        setIntField(term171919, term171919.getClass(), "totalReMasterSync", -1607540253);
        setIntField(term171919, term171919.getClass(), "playerRating", -944684699);
        setIntField(term171919, term171919.getClass(), "highestRating", -1134073298);
        setIntField(term171919, term171919.getClass(), "rankAuthTailId", 867252054);
        setField(term171919, term171919.getClass(), "eventWatchedDate", "XkQUchkoze");
        setField(term171919, term171919.getClass(), "webLimitDate", "xHufEneCSu");
        setIntField(term171919, term171919.getClass(), "challengeTrackPhase", -1324280406);
        setIntField(term171919, term171919.getClass(), "firstPlayBits", 796227640);
        setField(term171919, term171919.getClass(), "lastPlayDate", "dcNBqbQVSa");
        setIntField(term171919, term171919.getClass(), "lastPlaceId", 862188420);
        setField(term171919, term171919.getClass(), "lastPlaceName", "voFZMRWdRg");
        setIntField(term171919, term171919.getClass(), "lastRegionId", -377699095);
        setField(term171919, term171919.getClass(), "lastRegionName", "xUCRGyGVPj");
        setField(term171919, term171919.getClass(), "lastClientId", "mODhKHNihX");
        setField(term171919, term171919.getClass(), "lastCountryCode", "JuAcOfOxNL");
        setIntField(term171919, term171919.getClass(), "eventPoint", 783780138);
        setIntField(term171919, term171919.getClass(), "totalLv", 843687897);
        setIntField(term171919, term171919.getClass(), "lastLoginBonusDay", 1222555316);
        setIntField(term171919, term171919.getClass(), "lastSurvivalBonusDay", -917280584);
        setIntField(term171919, term171919.getClass(), "loginBonusLv", -1652502694);
        setField(term171917, term171917.getClass(), "user", term171919);
        setIntField(term171917, term171917.getClass(), "orderId", 1600850588);
        setLongField(term171917, term171917.getClass(), "sortNumber", 444711052508404757L);
        setIntField(term171917, term171917.getClass(), "placeId", 531959884);
        setField(term171917, term171917.getClass(), "placeName", "XaqYbQZIGI");
        setField(term171917, term171917.getClass(), "country", "grTooFWhNl");
        setIntField(term171917, term171917.getClass(), "regionId", 453038803);
        setField(term171917, term171917.getClass(), "playDate", "ndJgNFVDzv");
        setField(term171917, term171917.getClass(), "userPlayDate", "GLSpCLEiGN");
        setIntField(term171917, term171917.getClass(), "musicId", -1643872);
        setIntField(term171917, term171917.getClass(), "level", -1363610630);
        setIntField(term171917, term171917.getClass(), "gameMode", -969438923);
        setIntField(term171917, term171917.getClass(), "rivalNum", 79722514);
        setIntField(term171917, term171917.getClass(), "track", -369841734);
        setIntField(term171917, term171917.getClass(), "eventId", -1789774426);
        setBooleanField(term171917, term171917.getClass(), "isFreeToPlay", false);
        setIntField(term171917, term171917.getClass(), "playerRating", -328345541);
        setLongField(term171917, term171917.getClass(), "playedUserId1", -4433754356855281318L);
        setField(term171917, term171917.getClass(), "playedUserName1", "JiekpKxKqu");
        setIntField(term171917, term171917.getClass(), "playedMusicLevel1", 490655557);
        setLongField(term171917, term171917.getClass(), "playedUserId2", -8219871028565555567L);
        setField(term171917, term171917.getClass(), "playedUserName2", "fZAngeuZqR");
        setIntField(term171917, term171917.getClass(), "playedMusicLevel2", 1287220961);
        setLongField(term171917, term171917.getClass(), "playedUserId3", -4664784590063321060L);
        setField(term171917, term171917.getClass(), "playedUserName3", "zlkNfxvlVJ");
        setIntField(term171917, term171917.getClass(), "playedMusicLevel3", 2012955101);
        setIntField(term171917, term171917.getClass(), "achievement", -639961140);
        setIntField(term171917, term171917.getClass(), "score", 1146400176);
        setIntField(term171917, term171917.getClass(), "tapScore", -435174101);
        setIntField(term171917, term171917.getClass(), "holdScore", 487825154);
        setIntField(term171917, term171917.getClass(), "slideScore", 1564890111);
        setIntField(term171917, term171917.getClass(), "breakScore", 1589081782);
        setIntField(term171917, term171917.getClass(), "syncRate", -2022873040);
        setIntField(term171917, term171917.getClass(), "vsWin", -46759831);
        setBooleanField(term171917, term171917.getClass(), "isAllPerfect", true);
        setIntField(term171917, term171917.getClass(), "fullCombo", 635131096);
        setIntField(term171917, term171917.getClass(), "maxFever", 223351507);
        setIntField(term171917, term171917.getClass(), "maxCombo", -2001100304);
        setIntField(term171917, term171917.getClass(), "tapPerfect", 118200434);
        setIntField(term171917, term171917.getClass(), "tapGreat", -1035941686);
        setIntField(term171917, term171917.getClass(), "tapGood", -40508977);
        setIntField(term171917, term171917.getClass(), "tapBad", 345055988);
        setIntField(term171917, term171917.getClass(), "holdPerfect", -2054522918);
        setIntField(term171917, term171917.getClass(), "holdGreat", -329387140);
        setIntField(term171917, term171917.getClass(), "holdGood", -865461200);
        setIntField(term171917, term171917.getClass(), "holdBad", 1210890418);
        setIntField(term171917, term171917.getClass(), "slidePerfect", -649851315);
        setIntField(term171917, term171917.getClass(), "slideGreat", 1469793487);
        setIntField(term171917, term171917.getClass(), "slideGood", 734222319);
        setIntField(term171917, term171917.getClass(), "slideBad", -997030347);
        setIntField(term171917, term171917.getClass(), "breakPerfect", -227860418);
        setIntField(term171917, term171917.getClass(), "breakGreat", -1211565024);
        setIntField(term171917, term171917.getClass(), "breakGood", -2076171153);
        setIntField(term171917, term171917.getClass(), "breakBad", -1894800643);
        setBooleanField(term171917, term171917.getClass(), "isTrackSkip", true);
        setBooleanField(term171917, term171917.getClass(), "isHighScore", false);
        setBooleanField(term171917, term171917.getClass(), "isChallengeTrack", true);
        setIntField(term171917, term171917.getClass(), "challengeLife", 1536017915);
        setIntField(term171917, term171917.getClass(), "challengeRemain", 2025208778);
        setIntField(term171917, term171917.getClass(), "isAllPerfectPlus", 1370681770);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term171917, args);
    }

};


