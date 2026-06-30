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

public class UserPlaylog_setBreakGreat_1533067871113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term166233;
     Object term166545;

    public UserPlaylog_setBreakGreat_1533067871113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term166239 = new Long(-2286229228641472715L);
        term166233 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term166235 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term166237 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term166253 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term166254 = newInstance(Class.forName("java.time.LocalDate"));
        Object term166258 = newInstance(Class.forName("java.time.LocalTime"));
        Object term166263 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term166264 = newInstance(Class.forName("java.time.LocalDate"));
        Object term166268 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term166233, term166233.getClass(), "id", 4472414114652978334L);
        setLongField(term166235, term166235.getClass(), "id", 6759285425911636341L);
        setLongField(term166237, term166237.getClass(), "id", -2312307545038820068L);
        setField(term166237, term166237.getClass(), "extId", term166239);
        setField(term166237, term166237.getClass(), "luid", "qzKzPGJuGS");
        setIntField(term166254, term166254.getClass(), "year", 2029);
        setShortField(term166254, term166254.getClass(), "month", (short) 7);
        setShortField(term166254, term166254.getClass(), "day", (short) 2);
        setField(term166253, term166253.getClass(), "date", term166254);
        setByteField(term166258, term166258.getClass(), "hour", (byte) 4);
        setByteField(term166258, term166258.getClass(), "minute", (byte) 58);
        setByteField(term166258, term166258.getClass(), "second", (byte) 25);
        setIntField(term166258, term166258.getClass(), "nano", 652407918);
        setField(term166253, term166253.getClass(), "time", term166258);
        setField(term166237, term166237.getClass(), "registerTime", term166253);
        setIntField(term166264, term166264.getClass(), "year", 2017);
        setShortField(term166264, term166264.getClass(), "month", (short) 1);
        setShortField(term166264, term166264.getClass(), "day", (short) 19);
        setField(term166263, term166263.getClass(), "date", term166264);
        setByteField(term166268, term166268.getClass(), "hour", (byte) 2);
        setByteField(term166268, term166268.getClass(), "minute", (byte) 18);
        setByteField(term166268, term166268.getClass(), "second", (byte) 26);
        setIntField(term166268, term166268.getClass(), "nano", 562246787);
        setField(term166263, term166263.getClass(), "time", term166268);
        setField(term166237, term166237.getClass(), "accessTime", term166263);
        setField(term166235, term166235.getClass(), "card", term166237);
        setIntField(term166235, term166235.getClass(), "lastDataVersion", 221900604);
        setField(term166235, term166235.getClass(), "userName", "sqSrNLvGGR");
        setIntField(term166235, term166235.getClass(), "point", -642409547);
        setIntField(term166235, term166235.getClass(), "totalPoint", -579618057);
        setIntField(term166235, term166235.getClass(), "iconId", 759181094);
        setIntField(term166235, term166235.getClass(), "nameplateId", 507175678);
        setIntField(term166235, term166235.getClass(), "frameId", -327523994);
        setIntField(term166235, term166235.getClass(), "trophyId", -1620458450);
        setIntField(term166235, term166235.getClass(), "playCount", -1849665702);
        setIntField(term166235, term166235.getClass(), "playVsCount", 1897869584);
        setIntField(term166235, term166235.getClass(), "playSyncCount", -975662939);
        setIntField(term166235, term166235.getClass(), "winCount", 852140925);
        setIntField(term166235, term166235.getClass(), "helpCount", -1689144754);
        setIntField(term166235, term166235.getClass(), "comboCount", 243841357);
        setIntField(term166235, term166235.getClass(), "feverCount", -1193203879);
        setIntField(term166235, term166235.getClass(), "totalHiScore", 1883066023);
        setIntField(term166235, term166235.getClass(), "totalEasyHighScore", 1104472887);
        setIntField(term166235, term166235.getClass(), "totalBasicHighScore", -1535418445);
        setIntField(term166235, term166235.getClass(), "totalAdvancedHighScore", -1184630728);
        setIntField(term166235, term166235.getClass(), "totalExpertHighScore", 1585292479);
        setIntField(term166235, term166235.getClass(), "totalMasterHighScore", -1307048859);
        setIntField(term166235, term166235.getClass(), "totalReMasterHighScore", 941877009);
        setIntField(term166235, term166235.getClass(), "totalHighSync", 1812496746);
        setIntField(term166235, term166235.getClass(), "totalEasySync", 1962355198);
        setIntField(term166235, term166235.getClass(), "totalBasicSync", -1377253248);
        setIntField(term166235, term166235.getClass(), "totalAdvancedSync", 35996414);
        setIntField(term166235, term166235.getClass(), "totalExpertSync", -1882519188);
        setIntField(term166235, term166235.getClass(), "totalMasterSync", 1211051222);
        setIntField(term166235, term166235.getClass(), "totalReMasterSync", -653882349);
        setIntField(term166235, term166235.getClass(), "playerRating", 1125422349);
        setIntField(term166235, term166235.getClass(), "highestRating", 1614030391);
        setIntField(term166235, term166235.getClass(), "rankAuthTailId", 201566278);
        setField(term166235, term166235.getClass(), "eventWatchedDate", "qTeNEZoQMq");
        setField(term166235, term166235.getClass(), "webLimitDate", "lsfFhJHsOw");
        setIntField(term166235, term166235.getClass(), "challengeTrackPhase", 716178254);
        setIntField(term166235, term166235.getClass(), "firstPlayBits", 328943934);
        setField(term166235, term166235.getClass(), "lastPlayDate", "ItRdcNlydv");
        setIntField(term166235, term166235.getClass(), "lastPlaceId", -1403055456);
        setField(term166235, term166235.getClass(), "lastPlaceName", "SUQszaJTZI");
        setIntField(term166235, term166235.getClass(), "lastRegionId", -2109376657);
        setField(term166235, term166235.getClass(), "lastRegionName", "ecUXveHGcV");
        setField(term166235, term166235.getClass(), "lastClientId", "jSBkabnQzS");
        setField(term166235, term166235.getClass(), "lastCountryCode", "bOiHZqOEzP");
        setIntField(term166235, term166235.getClass(), "eventPoint", -200134649);
        setIntField(term166235, term166235.getClass(), "totalLv", -1355151946);
        setIntField(term166235, term166235.getClass(), "lastLoginBonusDay", -515541503);
        setIntField(term166235, term166235.getClass(), "lastSurvivalBonusDay", -1249268120);
        setIntField(term166235, term166235.getClass(), "loginBonusLv", 1017752578);
        setField(term166233, term166233.getClass(), "user", term166235);
        setIntField(term166233, term166233.getClass(), "orderId", -1591844430);
        setLongField(term166233, term166233.getClass(), "sortNumber", -5076378196239032509L);
        setIntField(term166233, term166233.getClass(), "placeId", 1678606873);
        setField(term166233, term166233.getClass(), "placeName", "qZMBOEMrvQ");
        setField(term166233, term166233.getClass(), "country", "GGqdxvNUQz");
        setIntField(term166233, term166233.getClass(), "regionId", -512283571);
        setField(term166233, term166233.getClass(), "playDate", "HVZRnOxaVb");
        setField(term166233, term166233.getClass(), "userPlayDate", "OGdPqQpijy");
        setIntField(term166233, term166233.getClass(), "musicId", 1593299825);
        setIntField(term166233, term166233.getClass(), "level", -349661255);
        setIntField(term166233, term166233.getClass(), "gameMode", -1384019152);
        setIntField(term166233, term166233.getClass(), "rivalNum", 278051486);
        setIntField(term166233, term166233.getClass(), "track", 1442943933);
        setIntField(term166233, term166233.getClass(), "eventId", -2023905519);
        setBooleanField(term166233, term166233.getClass(), "isFreeToPlay", true);
        setIntField(term166233, term166233.getClass(), "playerRating", 1621524095);
        setLongField(term166233, term166233.getClass(), "playedUserId1", -3954441930739441319L);
        setField(term166233, term166233.getClass(), "playedUserName1", "KeJHaUwtNs");
        setIntField(term166233, term166233.getClass(), "playedMusicLevel1", -992129595);
        setLongField(term166233, term166233.getClass(), "playedUserId2", -5840925148221311102L);
        setField(term166233, term166233.getClass(), "playedUserName2", "fTVsHSQKPY");
        setIntField(term166233, term166233.getClass(), "playedMusicLevel2", -1759124858);
        setLongField(term166233, term166233.getClass(), "playedUserId3", -4208738507614245483L);
        setField(term166233, term166233.getClass(), "playedUserName3", "PmiKCfPhji");
        setIntField(term166233, term166233.getClass(), "playedMusicLevel3", 114661491);
        setIntField(term166233, term166233.getClass(), "achievement", 1977146061);
        setIntField(term166233, term166233.getClass(), "score", -910345480);
        setIntField(term166233, term166233.getClass(), "tapScore", 1882595560);
        setIntField(term166233, term166233.getClass(), "holdScore", 100456961);
        setIntField(term166233, term166233.getClass(), "slideScore", -802287779);
        setIntField(term166233, term166233.getClass(), "breakScore", 2078570305);
        setIntField(term166233, term166233.getClass(), "syncRate", -6623488);
        setIntField(term166233, term166233.getClass(), "vsWin", 1610278519);
        setBooleanField(term166233, term166233.getClass(), "isAllPerfect", true);
        setIntField(term166233, term166233.getClass(), "fullCombo", -1772985081);
        setIntField(term166233, term166233.getClass(), "maxFever", 611529690);
        setIntField(term166233, term166233.getClass(), "maxCombo", 267662254);
        setIntField(term166233, term166233.getClass(), "tapPerfect", -1719686239);
        setIntField(term166233, term166233.getClass(), "tapGreat", 1090114980);
        setIntField(term166233, term166233.getClass(), "tapGood", -927503426);
        setIntField(term166233, term166233.getClass(), "tapBad", -2108990309);
        setIntField(term166233, term166233.getClass(), "holdPerfect", -1185127412);
        setIntField(term166233, term166233.getClass(), "holdGreat", -243501649);
        setIntField(term166233, term166233.getClass(), "holdGood", 752825980);
        setIntField(term166233, term166233.getClass(), "holdBad", -572843395);
        setIntField(term166233, term166233.getClass(), "slidePerfect", 2053363712);
        setIntField(term166233, term166233.getClass(), "slideGreat", -1583524824);
        setIntField(term166233, term166233.getClass(), "slideGood", -151194547);
        setIntField(term166233, term166233.getClass(), "slideBad", -220193383);
        setIntField(term166233, term166233.getClass(), "breakPerfect", 1767455149);
        setIntField(term166233, term166233.getClass(), "breakGreat", -1811614533);
        setIntField(term166233, term166233.getClass(), "breakGood", 1847175017);
        setIntField(term166233, term166233.getClass(), "breakBad", -484796791);
        setBooleanField(term166233, term166233.getClass(), "isTrackSkip", true);
        setBooleanField(term166233, term166233.getClass(), "isHighScore", true);
        setBooleanField(term166233, term166233.getClass(), "isChallengeTrack", true);
        setIntField(term166233, term166233.getClass(), "challengeLife", -1972105053);
        setIntField(term166233, term166233.getClass(), "challengeRemain", -102315999);
        setIntField(term166233, term166233.getClass(), "isAllPerfectPlus", 1610813077);
        term166545 = new Integer(-18841793);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term166545;
        callMethod(klass, "setBreakGreat", argTypes, term166233, args);
    }

};


