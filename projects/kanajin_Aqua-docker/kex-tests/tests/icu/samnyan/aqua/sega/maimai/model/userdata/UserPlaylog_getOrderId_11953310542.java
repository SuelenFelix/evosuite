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

public class UserPlaylog_getOrderId_11953310542 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term113335;

    public UserPlaylog_getOrderId_11953310542() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term113341 = new Long(-5552123402871285352L);
        term113335 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term113337 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term113339 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term113355 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term113356 = newInstance(Class.forName("java.time.LocalDate"));
        Object term113360 = newInstance(Class.forName("java.time.LocalTime"));
        Object term113365 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term113366 = newInstance(Class.forName("java.time.LocalDate"));
        Object term113370 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term113335, term113335.getClass(), "id", -7774176365237911445L);
        setLongField(term113337, term113337.getClass(), "id", -4171030293649718675L);
        setLongField(term113339, term113339.getClass(), "id", 4157679554798000555L);
        setField(term113339, term113339.getClass(), "extId", term113341);
        setField(term113339, term113339.getClass(), "luid", "XBzdZXeLDL");
        setIntField(term113356, term113356.getClass(), "year", 2012);
        setShortField(term113356, term113356.getClass(), "month", (short) 2);
        setShortField(term113356, term113356.getClass(), "day", (short) 16);
        setField(term113355, term113355.getClass(), "date", term113356);
        setByteField(term113360, term113360.getClass(), "hour", (byte) 5);
        setByteField(term113360, term113360.getClass(), "minute", (byte) 12);
        setByteField(term113360, term113360.getClass(), "second", (byte) 33);
        setIntField(term113360, term113360.getClass(), "nano", 551526646);
        setField(term113355, term113355.getClass(), "time", term113360);
        setField(term113339, term113339.getClass(), "registerTime", term113355);
        setIntField(term113366, term113366.getClass(), "year", 2028);
        setShortField(term113366, term113366.getClass(), "month", (short) 5);
        setShortField(term113366, term113366.getClass(), "day", (short) 29);
        setField(term113365, term113365.getClass(), "date", term113366);
        setByteField(term113370, term113370.getClass(), "hour", (byte) 0);
        setByteField(term113370, term113370.getClass(), "minute", (byte) 20);
        setByteField(term113370, term113370.getClass(), "second", (byte) 4);
        setIntField(term113370, term113370.getClass(), "nano", 186776026);
        setField(term113365, term113365.getClass(), "time", term113370);
        setField(term113339, term113339.getClass(), "accessTime", term113365);
        setField(term113337, term113337.getClass(), "card", term113339);
        setIntField(term113337, term113337.getClass(), "lastDataVersion", 1909906563);
        setField(term113337, term113337.getClass(), "userName", "eTycxkowtY");
        setIntField(term113337, term113337.getClass(), "point", 487426779);
        setIntField(term113337, term113337.getClass(), "totalPoint", -404184980);
        setIntField(term113337, term113337.getClass(), "iconId", 817353385);
        setIntField(term113337, term113337.getClass(), "nameplateId", 1732285177);
        setIntField(term113337, term113337.getClass(), "frameId", -692759323);
        setIntField(term113337, term113337.getClass(), "trophyId", 1869710466);
        setIntField(term113337, term113337.getClass(), "playCount", 756673805);
        setIntField(term113337, term113337.getClass(), "playVsCount", -1760100052);
        setIntField(term113337, term113337.getClass(), "playSyncCount", 1162383395);
        setIntField(term113337, term113337.getClass(), "winCount", -1210112971);
        setIntField(term113337, term113337.getClass(), "helpCount", 635840720);
        setIntField(term113337, term113337.getClass(), "comboCount", 601832303);
        setIntField(term113337, term113337.getClass(), "feverCount", -399801159);
        setIntField(term113337, term113337.getClass(), "totalHiScore", 1268354860);
        setIntField(term113337, term113337.getClass(), "totalEasyHighScore", 155248036);
        setIntField(term113337, term113337.getClass(), "totalBasicHighScore", 2012721194);
        setIntField(term113337, term113337.getClass(), "totalAdvancedHighScore", -699142829);
        setIntField(term113337, term113337.getClass(), "totalExpertHighScore", 1672191044);
        setIntField(term113337, term113337.getClass(), "totalMasterHighScore", 805828930);
        setIntField(term113337, term113337.getClass(), "totalReMasterHighScore", -2013090834);
        setIntField(term113337, term113337.getClass(), "totalHighSync", -759354449);
        setIntField(term113337, term113337.getClass(), "totalEasySync", -434381369);
        setIntField(term113337, term113337.getClass(), "totalBasicSync", -855023218);
        setIntField(term113337, term113337.getClass(), "totalAdvancedSync", -1033073975);
        setIntField(term113337, term113337.getClass(), "totalExpertSync", 709673310);
        setIntField(term113337, term113337.getClass(), "totalMasterSync", 1902388445);
        setIntField(term113337, term113337.getClass(), "totalReMasterSync", -168790792);
        setIntField(term113337, term113337.getClass(), "playerRating", 1242770139);
        setIntField(term113337, term113337.getClass(), "highestRating", 377426122);
        setIntField(term113337, term113337.getClass(), "rankAuthTailId", -48674750);
        setField(term113337, term113337.getClass(), "eventWatchedDate", "ozlrFdNXle");
        setField(term113337, term113337.getClass(), "webLimitDate", "vjUObaeMjo");
        setIntField(term113337, term113337.getClass(), "challengeTrackPhase", 220935460);
        setIntField(term113337, term113337.getClass(), "firstPlayBits", 2086237225);
        setField(term113337, term113337.getClass(), "lastPlayDate", "JsIgccyWag");
        setIntField(term113337, term113337.getClass(), "lastPlaceId", 1865460346);
        setField(term113337, term113337.getClass(), "lastPlaceName", "qSfmbHSpyF");
        setIntField(term113337, term113337.getClass(), "lastRegionId", -1698946504);
        setField(term113337, term113337.getClass(), "lastRegionName", "nfLAMGBNLz");
        setField(term113337, term113337.getClass(), "lastClientId", "uMLxdkYOdc");
        setField(term113337, term113337.getClass(), "lastCountryCode", "oRXjZDPrtE");
        setIntField(term113337, term113337.getClass(), "eventPoint", 1409263564);
        setIntField(term113337, term113337.getClass(), "totalLv", -62191184);
        setIntField(term113337, term113337.getClass(), "lastLoginBonusDay", 274246292);
        setIntField(term113337, term113337.getClass(), "lastSurvivalBonusDay", -473433665);
        setIntField(term113337, term113337.getClass(), "loginBonusLv", -853321243);
        setField(term113335, term113335.getClass(), "user", term113337);
        setIntField(term113335, term113335.getClass(), "orderId", 1780578237);
        setLongField(term113335, term113335.getClass(), "sortNumber", -6869725878798445523L);
        setIntField(term113335, term113335.getClass(), "placeId", 852290211);
        setField(term113335, term113335.getClass(), "placeName", "UYdKOLuJyq");
        setField(term113335, term113335.getClass(), "country", "WzRmLCtUaL");
        setIntField(term113335, term113335.getClass(), "regionId", -492713212);
        setField(term113335, term113335.getClass(), "playDate", "dqznIFBmKx");
        setField(term113335, term113335.getClass(), "userPlayDate", "MhTJfnBVaz");
        setIntField(term113335, term113335.getClass(), "musicId", -928681728);
        setIntField(term113335, term113335.getClass(), "level", 29193083);
        setIntField(term113335, term113335.getClass(), "gameMode", -915338342);
        setIntField(term113335, term113335.getClass(), "rivalNum", -1236327658);
        setIntField(term113335, term113335.getClass(), "track", -2078413069);
        setIntField(term113335, term113335.getClass(), "eventId", -658767923);
        setBooleanField(term113335, term113335.getClass(), "isFreeToPlay", true);
        setIntField(term113335, term113335.getClass(), "playerRating", -1161978855);
        setLongField(term113335, term113335.getClass(), "playedUserId1", -1338195308090100406L);
        setField(term113335, term113335.getClass(), "playedUserName1", "tWJuxHLcBL");
        setIntField(term113335, term113335.getClass(), "playedMusicLevel1", -1139637537);
        setLongField(term113335, term113335.getClass(), "playedUserId2", 3619359432967414857L);
        setField(term113335, term113335.getClass(), "playedUserName2", "ZOcslmWgQG");
        setIntField(term113335, term113335.getClass(), "playedMusicLevel2", 874187704);
        setLongField(term113335, term113335.getClass(), "playedUserId3", 6722117607141885589L);
        setField(term113335, term113335.getClass(), "playedUserName3", "YzxEEHlDUj");
        setIntField(term113335, term113335.getClass(), "playedMusicLevel3", -1225225379);
        setIntField(term113335, term113335.getClass(), "achievement", 161275630);
        setIntField(term113335, term113335.getClass(), "score", -914981551);
        setIntField(term113335, term113335.getClass(), "tapScore", -1477457516);
        setIntField(term113335, term113335.getClass(), "holdScore", 936008693);
        setIntField(term113335, term113335.getClass(), "slideScore", -194054691);
        setIntField(term113335, term113335.getClass(), "breakScore", -2077227809);
        setIntField(term113335, term113335.getClass(), "syncRate", 93661051);
        setIntField(term113335, term113335.getClass(), "vsWin", 1214044941);
        setBooleanField(term113335, term113335.getClass(), "isAllPerfect", false);
        setIntField(term113335, term113335.getClass(), "fullCombo", 98530468);
        setIntField(term113335, term113335.getClass(), "maxFever", 1859361838);
        setIntField(term113335, term113335.getClass(), "maxCombo", -92170830);
        setIntField(term113335, term113335.getClass(), "tapPerfect", 1164416932);
        setIntField(term113335, term113335.getClass(), "tapGreat", -1789747143);
        setIntField(term113335, term113335.getClass(), "tapGood", 148921868);
        setIntField(term113335, term113335.getClass(), "tapBad", 913346742);
        setIntField(term113335, term113335.getClass(), "holdPerfect", 428085587);
        setIntField(term113335, term113335.getClass(), "holdGreat", 1414585941);
        setIntField(term113335, term113335.getClass(), "holdGood", -782298976);
        setIntField(term113335, term113335.getClass(), "holdBad", 1078888028);
        setIntField(term113335, term113335.getClass(), "slidePerfect", 1252827294);
        setIntField(term113335, term113335.getClass(), "slideGreat", 398137653);
        setIntField(term113335, term113335.getClass(), "slideGood", -192759837);
        setIntField(term113335, term113335.getClass(), "slideBad", 1109092665);
        setIntField(term113335, term113335.getClass(), "breakPerfect", -229568371);
        setIntField(term113335, term113335.getClass(), "breakGreat", -419751009);
        setIntField(term113335, term113335.getClass(), "breakGood", -2120524978);
        setIntField(term113335, term113335.getClass(), "breakBad", 2027460163);
        setBooleanField(term113335, term113335.getClass(), "isTrackSkip", true);
        setBooleanField(term113335, term113335.getClass(), "isHighScore", false);
        setBooleanField(term113335, term113335.getClass(), "isChallengeTrack", false);
        setIntField(term113335, term113335.getClass(), "challengeLife", 220380539);
        setIntField(term113335, term113335.getClass(), "challengeRemain", -1659950814);
        setIntField(term113335, term113335.getClass(), "isAllPerfectPlus", -1098714411);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOrderId", argTypes, term113335, args);
    }

};


