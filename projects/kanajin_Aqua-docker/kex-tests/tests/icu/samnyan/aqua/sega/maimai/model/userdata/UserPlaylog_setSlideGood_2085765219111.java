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
import java.lang.Integer;

public class UserPlaylog_setSlideGood_2085765219111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term164867;
     Object term165179;

    public UserPlaylog_setSlideGood_2085765219111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term164873 = new Long(-4663904610228258188L);
        term164867 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term164869 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term164871 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term164887 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term164888 = newInstance(Class.forName("java.time.LocalDate"));
        Object term164892 = newInstance(Class.forName("java.time.LocalTime"));
        Object term164897 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term164898 = newInstance(Class.forName("java.time.LocalDate"));
        Object term164902 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term164867, term164867.getClass(), "id", 2295698553856643996L);
        setLongField(term164869, term164869.getClass(), "id", 7308834671443110196L);
        setLongField(term164871, term164871.getClass(), "id", 8524310798833172304L);
        setField(term164871, term164871.getClass(), "extId", term164873);
        setField(term164871, term164871.getClass(), "luid", "tMCXGgbNrO");
        setIntField(term164888, term164888.getClass(), "year", 2022);
        setShortField(term164888, term164888.getClass(), "month", (short) 6);
        setShortField(term164888, term164888.getClass(), "day", (short) 15);
        setField(term164887, term164887.getClass(), "date", term164888);
        setByteField(term164892, term164892.getClass(), "hour", (byte) 22);
        setByteField(term164892, term164892.getClass(), "minute", (byte) 45);
        setByteField(term164892, term164892.getClass(), "second", (byte) 15);
        setIntField(term164892, term164892.getClass(), "nano", 210438417);
        setField(term164887, term164887.getClass(), "time", term164892);
        setField(term164871, term164871.getClass(), "registerTime", term164887);
        setIntField(term164898, term164898.getClass(), "year", 2028);
        setShortField(term164898, term164898.getClass(), "month", (short) 5);
        setShortField(term164898, term164898.getClass(), "day", (short) 11);
        setField(term164897, term164897.getClass(), "date", term164898);
        setByteField(term164902, term164902.getClass(), "hour", (byte) 1);
        setByteField(term164902, term164902.getClass(), "minute", (byte) 18);
        setByteField(term164902, term164902.getClass(), "second", (byte) 27);
        setIntField(term164902, term164902.getClass(), "nano", 514067112);
        setField(term164897, term164897.getClass(), "time", term164902);
        setField(term164871, term164871.getClass(), "accessTime", term164897);
        setField(term164869, term164869.getClass(), "card", term164871);
        setIntField(term164869, term164869.getClass(), "lastDataVersion", 1796357295);
        setField(term164869, term164869.getClass(), "userName", "aXWtFmBWUL");
        setIntField(term164869, term164869.getClass(), "point", 1491595073);
        setIntField(term164869, term164869.getClass(), "totalPoint", -944073646);
        setIntField(term164869, term164869.getClass(), "iconId", 1037283887);
        setIntField(term164869, term164869.getClass(), "nameplateId", -124839616);
        setIntField(term164869, term164869.getClass(), "frameId", -1114127619);
        setIntField(term164869, term164869.getClass(), "trophyId", -1864310048);
        setIntField(term164869, term164869.getClass(), "playCount", -666341334);
        setIntField(term164869, term164869.getClass(), "playVsCount", 2143140424);
        setIntField(term164869, term164869.getClass(), "playSyncCount", 1565278751);
        setIntField(term164869, term164869.getClass(), "winCount", 853845004);
        setIntField(term164869, term164869.getClass(), "helpCount", -906215646);
        setIntField(term164869, term164869.getClass(), "comboCount", -895451788);
        setIntField(term164869, term164869.getClass(), "feverCount", -2034028726);
        setIntField(term164869, term164869.getClass(), "totalHiScore", -2103279590);
        setIntField(term164869, term164869.getClass(), "totalEasyHighScore", -1867257131);
        setIntField(term164869, term164869.getClass(), "totalBasicHighScore", -474838461);
        setIntField(term164869, term164869.getClass(), "totalAdvancedHighScore", 29034390);
        setIntField(term164869, term164869.getClass(), "totalExpertHighScore", -1231280271);
        setIntField(term164869, term164869.getClass(), "totalMasterHighScore", -1834930596);
        setIntField(term164869, term164869.getClass(), "totalReMasterHighScore", -1821846533);
        setIntField(term164869, term164869.getClass(), "totalHighSync", -879620237);
        setIntField(term164869, term164869.getClass(), "totalEasySync", 913680308);
        setIntField(term164869, term164869.getClass(), "totalBasicSync", -677386829);
        setIntField(term164869, term164869.getClass(), "totalAdvancedSync", 1466746592);
        setIntField(term164869, term164869.getClass(), "totalExpertSync", -691091002);
        setIntField(term164869, term164869.getClass(), "totalMasterSync", -800424430);
        setIntField(term164869, term164869.getClass(), "totalReMasterSync", -363441287);
        setIntField(term164869, term164869.getClass(), "playerRating", -2068310877);
        setIntField(term164869, term164869.getClass(), "highestRating", -1651098280);
        setIntField(term164869, term164869.getClass(), "rankAuthTailId", 126941917);
        setField(term164869, term164869.getClass(), "eventWatchedDate", "CYNAzQnEzc");
        setField(term164869, term164869.getClass(), "webLimitDate", "kwqIRfclWq");
        setIntField(term164869, term164869.getClass(), "challengeTrackPhase", -554860813);
        setIntField(term164869, term164869.getClass(), "firstPlayBits", -331590631);
        setField(term164869, term164869.getClass(), "lastPlayDate", "KsAdLTNdQU");
        setIntField(term164869, term164869.getClass(), "lastPlaceId", 678866032);
        setField(term164869, term164869.getClass(), "lastPlaceName", "pmwKSOyzWR");
        setIntField(term164869, term164869.getClass(), "lastRegionId", -1650996647);
        setField(term164869, term164869.getClass(), "lastRegionName", "OcYwcQLlkd");
        setField(term164869, term164869.getClass(), "lastClientId", "blXGNdFiqf");
        setField(term164869, term164869.getClass(), "lastCountryCode", "sLUdRliwnh");
        setIntField(term164869, term164869.getClass(), "eventPoint", 887287382);
        setIntField(term164869, term164869.getClass(), "totalLv", 490235948);
        setIntField(term164869, term164869.getClass(), "lastLoginBonusDay", -2009881923);
        setIntField(term164869, term164869.getClass(), "lastSurvivalBonusDay", 1209186006);
        setIntField(term164869, term164869.getClass(), "loginBonusLv", 1237664069);
        setField(term164867, term164867.getClass(), "user", term164869);
        setIntField(term164867, term164867.getClass(), "orderId", -1677139434);
        setLongField(term164867, term164867.getClass(), "sortNumber", -5865325072540492518L);
        setIntField(term164867, term164867.getClass(), "placeId", 78282106);
        setField(term164867, term164867.getClass(), "placeName", "SaRTYiJrju");
        setField(term164867, term164867.getClass(), "country", "kdIjkdKJZy");
        setIntField(term164867, term164867.getClass(), "regionId", -1276577791);
        setField(term164867, term164867.getClass(), "playDate", "mKMrWcRWqL");
        setField(term164867, term164867.getClass(), "userPlayDate", "lFItgokSBJ");
        setIntField(term164867, term164867.getClass(), "musicId", -540971112);
        setIntField(term164867, term164867.getClass(), "level", -413150517);
        setIntField(term164867, term164867.getClass(), "gameMode", 716493260);
        setIntField(term164867, term164867.getClass(), "rivalNum", -221731978);
        setIntField(term164867, term164867.getClass(), "track", 1560195166);
        setIntField(term164867, term164867.getClass(), "eventId", 1940111286);
        setBooleanField(term164867, term164867.getClass(), "isFreeToPlay", true);
        setIntField(term164867, term164867.getClass(), "playerRating", -782215827);
        setLongField(term164867, term164867.getClass(), "playedUserId1", 6575839504960308925L);
        setField(term164867, term164867.getClass(), "playedUserName1", "ttgZqAoLOg");
        setIntField(term164867, term164867.getClass(), "playedMusicLevel1", -1641540968);
        setLongField(term164867, term164867.getClass(), "playedUserId2", 3973872355126462836L);
        setField(term164867, term164867.getClass(), "playedUserName2", "nlbIjkRAop");
        setIntField(term164867, term164867.getClass(), "playedMusicLevel2", -1406972635);
        setLongField(term164867, term164867.getClass(), "playedUserId3", 3546596014708806813L);
        setField(term164867, term164867.getClass(), "playedUserName3", "gvsjHtWPEw");
        setIntField(term164867, term164867.getClass(), "playedMusicLevel3", 1409068712);
        setIntField(term164867, term164867.getClass(), "achievement", 1781149071);
        setIntField(term164867, term164867.getClass(), "score", -1147711067);
        setIntField(term164867, term164867.getClass(), "tapScore", 1530717560);
        setIntField(term164867, term164867.getClass(), "holdScore", -980321011);
        setIntField(term164867, term164867.getClass(), "slideScore", -496646150);
        setIntField(term164867, term164867.getClass(), "breakScore", -2117014524);
        setIntField(term164867, term164867.getClass(), "syncRate", -789911896);
        setIntField(term164867, term164867.getClass(), "vsWin", 1525085792);
        setBooleanField(term164867, term164867.getClass(), "isAllPerfect", false);
        setIntField(term164867, term164867.getClass(), "fullCombo", -740973961);
        setIntField(term164867, term164867.getClass(), "maxFever", -719672863);
        setIntField(term164867, term164867.getClass(), "maxCombo", 1213348815);
        setIntField(term164867, term164867.getClass(), "tapPerfect", -294298144);
        setIntField(term164867, term164867.getClass(), "tapGreat", 838771825);
        setIntField(term164867, term164867.getClass(), "tapGood", -780397829);
        setIntField(term164867, term164867.getClass(), "tapBad", 390953489);
        setIntField(term164867, term164867.getClass(), "holdPerfect", -1818206333);
        setIntField(term164867, term164867.getClass(), "holdGreat", 1596255960);
        setIntField(term164867, term164867.getClass(), "holdGood", 995740348);
        setIntField(term164867, term164867.getClass(), "holdBad", 1874660645);
        setIntField(term164867, term164867.getClass(), "slidePerfect", 1871223851);
        setIntField(term164867, term164867.getClass(), "slideGreat", 426460744);
        setIntField(term164867, term164867.getClass(), "slideGood", -1067312759);
        setIntField(term164867, term164867.getClass(), "slideBad", -116447213);
        setIntField(term164867, term164867.getClass(), "breakPerfect", 653083927);
        setIntField(term164867, term164867.getClass(), "breakGreat", -595821718);
        setIntField(term164867, term164867.getClass(), "breakGood", -1264044197);
        setIntField(term164867, term164867.getClass(), "breakBad", -229671362);
        setBooleanField(term164867, term164867.getClass(), "isTrackSkip", true);
        setBooleanField(term164867, term164867.getClass(), "isHighScore", false);
        setBooleanField(term164867, term164867.getClass(), "isChallengeTrack", true);
        setIntField(term164867, term164867.getClass(), "challengeLife", -2033747301);
        setIntField(term164867, term164867.getClass(), "challengeRemain", -1464306278);
        setIntField(term164867, term164867.getClass(), "isAllPerfectPlus", 1603349390);
        term165179 = new Integer(-208992091);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term165179;
        callMethod(klass, "setSlideGood", argTypes, term164867, args);
    }

};


