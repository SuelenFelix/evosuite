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

public class UserPlaylog_getMaxFever_151277294537 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term129855;

    public UserPlaylog_getMaxFever_151277294537() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term129861 = new Long(-769824408235898287L);
        term129855 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term129857 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term129859 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term129875 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term129876 = newInstance(Class.forName("java.time.LocalDate"));
        Object term129880 = newInstance(Class.forName("java.time.LocalTime"));
        Object term129885 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term129886 = newInstance(Class.forName("java.time.LocalDate"));
        Object term129890 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term129855, term129855.getClass(), "id", 3445409355788900348L);
        setLongField(term129857, term129857.getClass(), "id", -8079148366910851953L);
        setLongField(term129859, term129859.getClass(), "id", 7775195107098215044L);
        setField(term129859, term129859.getClass(), "extId", term129861);
        setField(term129859, term129859.getClass(), "luid", "wizysRLgRr");
        setIntField(term129876, term129876.getClass(), "year", 2018);
        setShortField(term129876, term129876.getClass(), "month", (short) 1);
        setShortField(term129876, term129876.getClass(), "day", (short) 8);
        setField(term129875, term129875.getClass(), "date", term129876);
        setByteField(term129880, term129880.getClass(), "hour", (byte) 23);
        setByteField(term129880, term129880.getClass(), "minute", (byte) 58);
        setByteField(term129880, term129880.getClass(), "second", (byte) 55);
        setIntField(term129880, term129880.getClass(), "nano", 748244349);
        setField(term129875, term129875.getClass(), "time", term129880);
        setField(term129859, term129859.getClass(), "registerTime", term129875);
        setIntField(term129886, term129886.getClass(), "year", 2012);
        setShortField(term129886, term129886.getClass(), "month", (short) 12);
        setShortField(term129886, term129886.getClass(), "day", (short) 21);
        setField(term129885, term129885.getClass(), "date", term129886);
        setByteField(term129890, term129890.getClass(), "hour", (byte) 3);
        setByteField(term129890, term129890.getClass(), "minute", (byte) 1);
        setByteField(term129890, term129890.getClass(), "second", (byte) 47);
        setIntField(term129890, term129890.getClass(), "nano", 592405787);
        setField(term129885, term129885.getClass(), "time", term129890);
        setField(term129859, term129859.getClass(), "accessTime", term129885);
        setField(term129857, term129857.getClass(), "card", term129859);
        setIntField(term129857, term129857.getClass(), "lastDataVersion", 779226069);
        setField(term129857, term129857.getClass(), "userName", "VbDDltcmiT");
        setIntField(term129857, term129857.getClass(), "point", 1360267381);
        setIntField(term129857, term129857.getClass(), "totalPoint", -1238229215);
        setIntField(term129857, term129857.getClass(), "iconId", 1604817674);
        setIntField(term129857, term129857.getClass(), "nameplateId", 1716104970);
        setIntField(term129857, term129857.getClass(), "frameId", 611301077);
        setIntField(term129857, term129857.getClass(), "trophyId", 1776391412);
        setIntField(term129857, term129857.getClass(), "playCount", 206840742);
        setIntField(term129857, term129857.getClass(), "playVsCount", 2082328508);
        setIntField(term129857, term129857.getClass(), "playSyncCount", -162243930);
        setIntField(term129857, term129857.getClass(), "winCount", 872217662);
        setIntField(term129857, term129857.getClass(), "helpCount", 1675988214);
        setIntField(term129857, term129857.getClass(), "comboCount", 72481893);
        setIntField(term129857, term129857.getClass(), "feverCount", -1835966293);
        setIntField(term129857, term129857.getClass(), "totalHiScore", -408154519);
        setIntField(term129857, term129857.getClass(), "totalEasyHighScore", -300777303);
        setIntField(term129857, term129857.getClass(), "totalBasicHighScore", 1741476389);
        setIntField(term129857, term129857.getClass(), "totalAdvancedHighScore", 785777431);
        setIntField(term129857, term129857.getClass(), "totalExpertHighScore", -1694371655);
        setIntField(term129857, term129857.getClass(), "totalMasterHighScore", -1608823920);
        setIntField(term129857, term129857.getClass(), "totalReMasterHighScore", 1821563586);
        setIntField(term129857, term129857.getClass(), "totalHighSync", -607557315);
        setIntField(term129857, term129857.getClass(), "totalEasySync", -860984329);
        setIntField(term129857, term129857.getClass(), "totalBasicSync", -1536434576);
        setIntField(term129857, term129857.getClass(), "totalAdvancedSync", -987576592);
        setIntField(term129857, term129857.getClass(), "totalExpertSync", 442011273);
        setIntField(term129857, term129857.getClass(), "totalMasterSync", 1956149843);
        setIntField(term129857, term129857.getClass(), "totalReMasterSync", -837480422);
        setIntField(term129857, term129857.getClass(), "playerRating", 1860470993);
        setIntField(term129857, term129857.getClass(), "highestRating", -863558477);
        setIntField(term129857, term129857.getClass(), "rankAuthTailId", -671527034);
        setField(term129857, term129857.getClass(), "eventWatchedDate", "VWIEojCQCj");
        setField(term129857, term129857.getClass(), "webLimitDate", "jbeRMWjQTQ");
        setIntField(term129857, term129857.getClass(), "challengeTrackPhase", -355504967);
        setIntField(term129857, term129857.getClass(), "firstPlayBits", 487658174);
        setField(term129857, term129857.getClass(), "lastPlayDate", "YOjmohMpFb");
        setIntField(term129857, term129857.getClass(), "lastPlaceId", -1003494096);
        setField(term129857, term129857.getClass(), "lastPlaceName", "WCRWOgfbRC");
        setIntField(term129857, term129857.getClass(), "lastRegionId", -916635849);
        setField(term129857, term129857.getClass(), "lastRegionName", "MeiYkUfwEV");
        setField(term129857, term129857.getClass(), "lastClientId", "YOelMtNboh");
        setField(term129857, term129857.getClass(), "lastCountryCode", "ngShbLrxUt");
        setIntField(term129857, term129857.getClass(), "eventPoint", -292870550);
        setIntField(term129857, term129857.getClass(), "totalLv", 932232775);
        setIntField(term129857, term129857.getClass(), "lastLoginBonusDay", -2014050836);
        setIntField(term129857, term129857.getClass(), "lastSurvivalBonusDay", 1398941087);
        setIntField(term129857, term129857.getClass(), "loginBonusLv", 1739979538);
        setField(term129855, term129855.getClass(), "user", term129857);
        setIntField(term129855, term129855.getClass(), "orderId", -525688968);
        setLongField(term129855, term129855.getClass(), "sortNumber", -1826927759081147983L);
        setIntField(term129855, term129855.getClass(), "placeId", -27212490);
        setField(term129855, term129855.getClass(), "placeName", "tyyoVDzJBp");
        setField(term129855, term129855.getClass(), "country", "tbFDmscmBa");
        setIntField(term129855, term129855.getClass(), "regionId", -262064529);
        setField(term129855, term129855.getClass(), "playDate", "iwNiuIUhrn");
        setField(term129855, term129855.getClass(), "userPlayDate", "uRfXEtHgIt");
        setIntField(term129855, term129855.getClass(), "musicId", 882451306);
        setIntField(term129855, term129855.getClass(), "level", 1363101790);
        setIntField(term129855, term129855.getClass(), "gameMode", 877478140);
        setIntField(term129855, term129855.getClass(), "rivalNum", -877898256);
        setIntField(term129855, term129855.getClass(), "track", -843145378);
        setIntField(term129855, term129855.getClass(), "eventId", -1108492087);
        setBooleanField(term129855, term129855.getClass(), "isFreeToPlay", false);
        setIntField(term129855, term129855.getClass(), "playerRating", -2065560265);
        setLongField(term129855, term129855.getClass(), "playedUserId1", 1770574028303523867L);
        setField(term129855, term129855.getClass(), "playedUserName1", "lzrbwfKykX");
        setIntField(term129855, term129855.getClass(), "playedMusicLevel1", -387620756);
        setLongField(term129855, term129855.getClass(), "playedUserId2", 6434856191210114702L);
        setField(term129855, term129855.getClass(), "playedUserName2", "eZWnfePnkp");
        setIntField(term129855, term129855.getClass(), "playedMusicLevel2", -126979177);
        setLongField(term129855, term129855.getClass(), "playedUserId3", 1306769240431962876L);
        setField(term129855, term129855.getClass(), "playedUserName3", "BSdXqptUKz");
        setIntField(term129855, term129855.getClass(), "playedMusicLevel3", -131484078);
        setIntField(term129855, term129855.getClass(), "achievement", -622903896);
        setIntField(term129855, term129855.getClass(), "score", -445119540);
        setIntField(term129855, term129855.getClass(), "tapScore", 2085203030);
        setIntField(term129855, term129855.getClass(), "holdScore", 2033592479);
        setIntField(term129855, term129855.getClass(), "slideScore", 1523373764);
        setIntField(term129855, term129855.getClass(), "breakScore", -1381691518);
        setIntField(term129855, term129855.getClass(), "syncRate", -1055770237);
        setIntField(term129855, term129855.getClass(), "vsWin", 1516770789);
        setBooleanField(term129855, term129855.getClass(), "isAllPerfect", true);
        setIntField(term129855, term129855.getClass(), "fullCombo", -2146641428);
        setIntField(term129855, term129855.getClass(), "maxFever", 1813536424);
        setIntField(term129855, term129855.getClass(), "maxCombo", -1827932155);
        setIntField(term129855, term129855.getClass(), "tapPerfect", -1840714834);
        setIntField(term129855, term129855.getClass(), "tapGreat", 42295520);
        setIntField(term129855, term129855.getClass(), "tapGood", 250658921);
        setIntField(term129855, term129855.getClass(), "tapBad", -699106220);
        setIntField(term129855, term129855.getClass(), "holdPerfect", 1231601627);
        setIntField(term129855, term129855.getClass(), "holdGreat", -619938699);
        setIntField(term129855, term129855.getClass(), "holdGood", 2041807519);
        setIntField(term129855, term129855.getClass(), "holdBad", -1588301237);
        setIntField(term129855, term129855.getClass(), "slidePerfect", 674010604);
        setIntField(term129855, term129855.getClass(), "slideGreat", -1993946490);
        setIntField(term129855, term129855.getClass(), "slideGood", 1192985277);
        setIntField(term129855, term129855.getClass(), "slideBad", 356951618);
        setIntField(term129855, term129855.getClass(), "breakPerfect", -1864027009);
        setIntField(term129855, term129855.getClass(), "breakGreat", -1606093016);
        setIntField(term129855, term129855.getClass(), "breakGood", 1649273071);
        setIntField(term129855, term129855.getClass(), "breakBad", -1224864932);
        setBooleanField(term129855, term129855.getClass(), "isTrackSkip", false);
        setBooleanField(term129855, term129855.getClass(), "isHighScore", true);
        setBooleanField(term129855, term129855.getClass(), "isChallengeTrack", true);
        setIntField(term129855, term129855.getClass(), "challengeLife", 54480662);
        setIntField(term129855, term129855.getClass(), "challengeRemain", 1555799329);
        setIntField(term129855, term129855.getClass(), "isAllPerfectPlus", -1426263681);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMaxFever", argTypes, term129855, args);
    }

};


