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

public class UserPlaylog_setSlideGood_2085765219110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term164811;
     Object term165123;

    public UserPlaylog_setSlideGood_2085765219110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term164817 = new Long(-4663904610228258188L);
        term164811 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term164813 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term164815 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term164831 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term164832 = newInstance(Class.forName("java.time.LocalDate"));
        Object term164836 = newInstance(Class.forName("java.time.LocalTime"));
        Object term164841 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term164842 = newInstance(Class.forName("java.time.LocalDate"));
        Object term164846 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term164811, term164811.getClass(), "id", 2295698553856643996L);
        setLongField(term164813, term164813.getClass(), "id", 7308834671443110196L);
        setLongField(term164815, term164815.getClass(), "id", 8524310798833172304L);
        setField(term164815, term164815.getClass(), "extId", term164817);
        setField(term164815, term164815.getClass(), "luid", "tMCXGgbNrO");
        setIntField(term164832, term164832.getClass(), "year", 2022);
        setShortField(term164832, term164832.getClass(), "month", (short) 6);
        setShortField(term164832, term164832.getClass(), "day", (short) 15);
        setField(term164831, term164831.getClass(), "date", term164832);
        setByteField(term164836, term164836.getClass(), "hour", (byte) 22);
        setByteField(term164836, term164836.getClass(), "minute", (byte) 45);
        setByteField(term164836, term164836.getClass(), "second", (byte) 15);
        setIntField(term164836, term164836.getClass(), "nano", 210438417);
        setField(term164831, term164831.getClass(), "time", term164836);
        setField(term164815, term164815.getClass(), "registerTime", term164831);
        setIntField(term164842, term164842.getClass(), "year", 2028);
        setShortField(term164842, term164842.getClass(), "month", (short) 5);
        setShortField(term164842, term164842.getClass(), "day", (short) 11);
        setField(term164841, term164841.getClass(), "date", term164842);
        setByteField(term164846, term164846.getClass(), "hour", (byte) 1);
        setByteField(term164846, term164846.getClass(), "minute", (byte) 18);
        setByteField(term164846, term164846.getClass(), "second", (byte) 27);
        setIntField(term164846, term164846.getClass(), "nano", 514067112);
        setField(term164841, term164841.getClass(), "time", term164846);
        setField(term164815, term164815.getClass(), "accessTime", term164841);
        setField(term164813, term164813.getClass(), "card", term164815);
        setIntField(term164813, term164813.getClass(), "lastDataVersion", 1796357295);
        setField(term164813, term164813.getClass(), "userName", "aXWtFmBWUL");
        setIntField(term164813, term164813.getClass(), "point", 1491595073);
        setIntField(term164813, term164813.getClass(), "totalPoint", -944073646);
        setIntField(term164813, term164813.getClass(), "iconId", 1037283887);
        setIntField(term164813, term164813.getClass(), "nameplateId", -124839616);
        setIntField(term164813, term164813.getClass(), "frameId", -1114127619);
        setIntField(term164813, term164813.getClass(), "trophyId", -1864310048);
        setIntField(term164813, term164813.getClass(), "playCount", -666341334);
        setIntField(term164813, term164813.getClass(), "playVsCount", 2143140424);
        setIntField(term164813, term164813.getClass(), "playSyncCount", 1565278751);
        setIntField(term164813, term164813.getClass(), "winCount", 853845004);
        setIntField(term164813, term164813.getClass(), "helpCount", -906215646);
        setIntField(term164813, term164813.getClass(), "comboCount", -895451788);
        setIntField(term164813, term164813.getClass(), "feverCount", -2034028726);
        setIntField(term164813, term164813.getClass(), "totalHiScore", -2103279590);
        setIntField(term164813, term164813.getClass(), "totalEasyHighScore", -1867257131);
        setIntField(term164813, term164813.getClass(), "totalBasicHighScore", -474838461);
        setIntField(term164813, term164813.getClass(), "totalAdvancedHighScore", 29034390);
        setIntField(term164813, term164813.getClass(), "totalExpertHighScore", -1231280271);
        setIntField(term164813, term164813.getClass(), "totalMasterHighScore", -1834930596);
        setIntField(term164813, term164813.getClass(), "totalReMasterHighScore", -1821846533);
        setIntField(term164813, term164813.getClass(), "totalHighSync", -879620237);
        setIntField(term164813, term164813.getClass(), "totalEasySync", 913680308);
        setIntField(term164813, term164813.getClass(), "totalBasicSync", -677386829);
        setIntField(term164813, term164813.getClass(), "totalAdvancedSync", 1466746592);
        setIntField(term164813, term164813.getClass(), "totalExpertSync", -691091002);
        setIntField(term164813, term164813.getClass(), "totalMasterSync", -800424430);
        setIntField(term164813, term164813.getClass(), "totalReMasterSync", -363441287);
        setIntField(term164813, term164813.getClass(), "playerRating", -2068310877);
        setIntField(term164813, term164813.getClass(), "highestRating", -1651098280);
        setIntField(term164813, term164813.getClass(), "rankAuthTailId", 126941917);
        setField(term164813, term164813.getClass(), "eventWatchedDate", "CYNAzQnEzc");
        setField(term164813, term164813.getClass(), "webLimitDate", "kwqIRfclWq");
        setIntField(term164813, term164813.getClass(), "challengeTrackPhase", -554860813);
        setIntField(term164813, term164813.getClass(), "firstPlayBits", -331590631);
        setField(term164813, term164813.getClass(), "lastPlayDate", "KsAdLTNdQU");
        setIntField(term164813, term164813.getClass(), "lastPlaceId", 678866032);
        setField(term164813, term164813.getClass(), "lastPlaceName", "pmwKSOyzWR");
        setIntField(term164813, term164813.getClass(), "lastRegionId", -1650996647);
        setField(term164813, term164813.getClass(), "lastRegionName", "OcYwcQLlkd");
        setField(term164813, term164813.getClass(), "lastClientId", "blXGNdFiqf");
        setField(term164813, term164813.getClass(), "lastCountryCode", "sLUdRliwnh");
        setIntField(term164813, term164813.getClass(), "eventPoint", 887287382);
        setIntField(term164813, term164813.getClass(), "totalLv", 490235948);
        setIntField(term164813, term164813.getClass(), "lastLoginBonusDay", -2009881923);
        setIntField(term164813, term164813.getClass(), "lastSurvivalBonusDay", 1209186006);
        setIntField(term164813, term164813.getClass(), "loginBonusLv", 1237664069);
        setField(term164811, term164811.getClass(), "user", term164813);
        setIntField(term164811, term164811.getClass(), "orderId", -1677139434);
        setLongField(term164811, term164811.getClass(), "sortNumber", -5865325072540492518L);
        setIntField(term164811, term164811.getClass(), "placeId", 78282106);
        setField(term164811, term164811.getClass(), "placeName", "SaRTYiJrju");
        setField(term164811, term164811.getClass(), "country", "kdIjkdKJZy");
        setIntField(term164811, term164811.getClass(), "regionId", -1276577791);
        setField(term164811, term164811.getClass(), "playDate", "mKMrWcRWqL");
        setField(term164811, term164811.getClass(), "userPlayDate", "lFItgokSBJ");
        setIntField(term164811, term164811.getClass(), "musicId", -540971112);
        setIntField(term164811, term164811.getClass(), "level", -413150517);
        setIntField(term164811, term164811.getClass(), "gameMode", 716493260);
        setIntField(term164811, term164811.getClass(), "rivalNum", -221731978);
        setIntField(term164811, term164811.getClass(), "track", 1560195166);
        setIntField(term164811, term164811.getClass(), "eventId", 1940111286);
        setBooleanField(term164811, term164811.getClass(), "isFreeToPlay", true);
        setIntField(term164811, term164811.getClass(), "playerRating", -782215827);
        setLongField(term164811, term164811.getClass(), "playedUserId1", 6575839504960308925L);
        setField(term164811, term164811.getClass(), "playedUserName1", "ttgZqAoLOg");
        setIntField(term164811, term164811.getClass(), "playedMusicLevel1", -1641540968);
        setLongField(term164811, term164811.getClass(), "playedUserId2", 3973872355126462836L);
        setField(term164811, term164811.getClass(), "playedUserName2", "nlbIjkRAop");
        setIntField(term164811, term164811.getClass(), "playedMusicLevel2", -1406972635);
        setLongField(term164811, term164811.getClass(), "playedUserId3", 3546596014708806813L);
        setField(term164811, term164811.getClass(), "playedUserName3", "gvsjHtWPEw");
        setIntField(term164811, term164811.getClass(), "playedMusicLevel3", 1409068712);
        setIntField(term164811, term164811.getClass(), "achievement", 1781149071);
        setIntField(term164811, term164811.getClass(), "score", -1147711067);
        setIntField(term164811, term164811.getClass(), "tapScore", 1530717560);
        setIntField(term164811, term164811.getClass(), "holdScore", -980321011);
        setIntField(term164811, term164811.getClass(), "slideScore", -496646150);
        setIntField(term164811, term164811.getClass(), "breakScore", -2117014524);
        setIntField(term164811, term164811.getClass(), "syncRate", -789911896);
        setIntField(term164811, term164811.getClass(), "vsWin", 1525085792);
        setBooleanField(term164811, term164811.getClass(), "isAllPerfect", false);
        setIntField(term164811, term164811.getClass(), "fullCombo", -740973961);
        setIntField(term164811, term164811.getClass(), "maxFever", -719672863);
        setIntField(term164811, term164811.getClass(), "maxCombo", 1213348815);
        setIntField(term164811, term164811.getClass(), "tapPerfect", -294298144);
        setIntField(term164811, term164811.getClass(), "tapGreat", 838771825);
        setIntField(term164811, term164811.getClass(), "tapGood", -780397829);
        setIntField(term164811, term164811.getClass(), "tapBad", 390953489);
        setIntField(term164811, term164811.getClass(), "holdPerfect", -1818206333);
        setIntField(term164811, term164811.getClass(), "holdGreat", 1596255960);
        setIntField(term164811, term164811.getClass(), "holdGood", 995740348);
        setIntField(term164811, term164811.getClass(), "holdBad", 1874660645);
        setIntField(term164811, term164811.getClass(), "slidePerfect", 1871223851);
        setIntField(term164811, term164811.getClass(), "slideGreat", 426460744);
        setIntField(term164811, term164811.getClass(), "slideGood", -1067312759);
        setIntField(term164811, term164811.getClass(), "slideBad", -116447213);
        setIntField(term164811, term164811.getClass(), "breakPerfect", 653083927);
        setIntField(term164811, term164811.getClass(), "breakGreat", -595821718);
        setIntField(term164811, term164811.getClass(), "breakGood", -1264044197);
        setIntField(term164811, term164811.getClass(), "breakBad", -229671362);
        setBooleanField(term164811, term164811.getClass(), "isTrackSkip", true);
        setBooleanField(term164811, term164811.getClass(), "isHighScore", false);
        setBooleanField(term164811, term164811.getClass(), "isChallengeTrack", true);
        setIntField(term164811, term164811.getClass(), "challengeLife", -2033747301);
        setIntField(term164811, term164811.getClass(), "challengeRemain", -1464306278);
        setIntField(term164811, term164811.getClass(), "isAllPerfectPlus", 1603349390);
        term165123 = new Integer(-208992091);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term165123;
        callMethod(klass, "setSlideGood", argTypes, term164811, args);
    }

};


