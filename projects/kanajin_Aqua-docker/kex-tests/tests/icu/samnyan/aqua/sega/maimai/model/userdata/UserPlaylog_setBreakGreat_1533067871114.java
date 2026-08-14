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

public class UserPlaylog_setBreakGreat_1533067871114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term166289;
     Object term166601;

    public UserPlaylog_setBreakGreat_1533067871114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term166295 = new Long(-2286229228641472715L);
        term166289 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term166291 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term166293 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term166309 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term166310 = newInstance(Class.forName("java.time.LocalDate"));
        Object term166314 = newInstance(Class.forName("java.time.LocalTime"));
        Object term166319 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term166320 = newInstance(Class.forName("java.time.LocalDate"));
        Object term166324 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term166289, term166289.getClass(), "id", 4472414114652978334L);
        setLongField(term166291, term166291.getClass(), "id", 6759285425911636341L);
        setLongField(term166293, term166293.getClass(), "id", -2312307545038820068L);
        setField(term166293, term166293.getClass(), "extId", term166295);
        setField(term166293, term166293.getClass(), "luid", "qzKzPGJuGS");
        setIntField(term166310, term166310.getClass(), "year", 2029);
        setShortField(term166310, term166310.getClass(), "month", (short) 7);
        setShortField(term166310, term166310.getClass(), "day", (short) 2);
        setField(term166309, term166309.getClass(), "date", term166310);
        setByteField(term166314, term166314.getClass(), "hour", (byte) 4);
        setByteField(term166314, term166314.getClass(), "minute", (byte) 58);
        setByteField(term166314, term166314.getClass(), "second", (byte) 25);
        setIntField(term166314, term166314.getClass(), "nano", 652407918);
        setField(term166309, term166309.getClass(), "time", term166314);
        setField(term166293, term166293.getClass(), "registerTime", term166309);
        setIntField(term166320, term166320.getClass(), "year", 2017);
        setShortField(term166320, term166320.getClass(), "month", (short) 1);
        setShortField(term166320, term166320.getClass(), "day", (short) 19);
        setField(term166319, term166319.getClass(), "date", term166320);
        setByteField(term166324, term166324.getClass(), "hour", (byte) 2);
        setByteField(term166324, term166324.getClass(), "minute", (byte) 18);
        setByteField(term166324, term166324.getClass(), "second", (byte) 26);
        setIntField(term166324, term166324.getClass(), "nano", 562246787);
        setField(term166319, term166319.getClass(), "time", term166324);
        setField(term166293, term166293.getClass(), "accessTime", term166319);
        setField(term166291, term166291.getClass(), "card", term166293);
        setIntField(term166291, term166291.getClass(), "lastDataVersion", 221900604);
        setField(term166291, term166291.getClass(), "userName", "sqSrNLvGGR");
        setIntField(term166291, term166291.getClass(), "point", -642409547);
        setIntField(term166291, term166291.getClass(), "totalPoint", -579618057);
        setIntField(term166291, term166291.getClass(), "iconId", 759181094);
        setIntField(term166291, term166291.getClass(), "nameplateId", 507175678);
        setIntField(term166291, term166291.getClass(), "frameId", -327523994);
        setIntField(term166291, term166291.getClass(), "trophyId", -1620458450);
        setIntField(term166291, term166291.getClass(), "playCount", -1849665702);
        setIntField(term166291, term166291.getClass(), "playVsCount", 1897869584);
        setIntField(term166291, term166291.getClass(), "playSyncCount", -975662939);
        setIntField(term166291, term166291.getClass(), "winCount", 852140925);
        setIntField(term166291, term166291.getClass(), "helpCount", -1689144754);
        setIntField(term166291, term166291.getClass(), "comboCount", 243841357);
        setIntField(term166291, term166291.getClass(), "feverCount", -1193203879);
        setIntField(term166291, term166291.getClass(), "totalHiScore", 1883066023);
        setIntField(term166291, term166291.getClass(), "totalEasyHighScore", 1104472887);
        setIntField(term166291, term166291.getClass(), "totalBasicHighScore", -1535418445);
        setIntField(term166291, term166291.getClass(), "totalAdvancedHighScore", -1184630728);
        setIntField(term166291, term166291.getClass(), "totalExpertHighScore", 1585292479);
        setIntField(term166291, term166291.getClass(), "totalMasterHighScore", -1307048859);
        setIntField(term166291, term166291.getClass(), "totalReMasterHighScore", 941877009);
        setIntField(term166291, term166291.getClass(), "totalHighSync", 1812496746);
        setIntField(term166291, term166291.getClass(), "totalEasySync", 1962355198);
        setIntField(term166291, term166291.getClass(), "totalBasicSync", -1377253248);
        setIntField(term166291, term166291.getClass(), "totalAdvancedSync", 35996414);
        setIntField(term166291, term166291.getClass(), "totalExpertSync", -1882519188);
        setIntField(term166291, term166291.getClass(), "totalMasterSync", 1211051222);
        setIntField(term166291, term166291.getClass(), "totalReMasterSync", -653882349);
        setIntField(term166291, term166291.getClass(), "playerRating", 1125422349);
        setIntField(term166291, term166291.getClass(), "highestRating", 1614030391);
        setIntField(term166291, term166291.getClass(), "rankAuthTailId", 201566278);
        setField(term166291, term166291.getClass(), "eventWatchedDate", "qTeNEZoQMq");
        setField(term166291, term166291.getClass(), "webLimitDate", "lsfFhJHsOw");
        setIntField(term166291, term166291.getClass(), "challengeTrackPhase", 716178254);
        setIntField(term166291, term166291.getClass(), "firstPlayBits", 328943934);
        setField(term166291, term166291.getClass(), "lastPlayDate", "ItRdcNlydv");
        setIntField(term166291, term166291.getClass(), "lastPlaceId", -1403055456);
        setField(term166291, term166291.getClass(), "lastPlaceName", "SUQszaJTZI");
        setIntField(term166291, term166291.getClass(), "lastRegionId", -2109376657);
        setField(term166291, term166291.getClass(), "lastRegionName", "ecUXveHGcV");
        setField(term166291, term166291.getClass(), "lastClientId", "jSBkabnQzS");
        setField(term166291, term166291.getClass(), "lastCountryCode", "bOiHZqOEzP");
        setIntField(term166291, term166291.getClass(), "eventPoint", -200134649);
        setIntField(term166291, term166291.getClass(), "totalLv", -1355151946);
        setIntField(term166291, term166291.getClass(), "lastLoginBonusDay", -515541503);
        setIntField(term166291, term166291.getClass(), "lastSurvivalBonusDay", -1249268120);
        setIntField(term166291, term166291.getClass(), "loginBonusLv", 1017752578);
        setField(term166289, term166289.getClass(), "user", term166291);
        setIntField(term166289, term166289.getClass(), "orderId", -1591844430);
        setLongField(term166289, term166289.getClass(), "sortNumber", -5076378196239032509L);
        setIntField(term166289, term166289.getClass(), "placeId", 1678606873);
        setField(term166289, term166289.getClass(), "placeName", "qZMBOEMrvQ");
        setField(term166289, term166289.getClass(), "country", "GGqdxvNUQz");
        setIntField(term166289, term166289.getClass(), "regionId", -512283571);
        setField(term166289, term166289.getClass(), "playDate", "HVZRnOxaVb");
        setField(term166289, term166289.getClass(), "userPlayDate", "OGdPqQpijy");
        setIntField(term166289, term166289.getClass(), "musicId", 1593299825);
        setIntField(term166289, term166289.getClass(), "level", -349661255);
        setIntField(term166289, term166289.getClass(), "gameMode", -1384019152);
        setIntField(term166289, term166289.getClass(), "rivalNum", 278051486);
        setIntField(term166289, term166289.getClass(), "track", 1442943933);
        setIntField(term166289, term166289.getClass(), "eventId", -2023905519);
        setBooleanField(term166289, term166289.getClass(), "isFreeToPlay", true);
        setIntField(term166289, term166289.getClass(), "playerRating", 1621524095);
        setLongField(term166289, term166289.getClass(), "playedUserId1", -3954441930739441319L);
        setField(term166289, term166289.getClass(), "playedUserName1", "KeJHaUwtNs");
        setIntField(term166289, term166289.getClass(), "playedMusicLevel1", -992129595);
        setLongField(term166289, term166289.getClass(), "playedUserId2", -5840925148221311102L);
        setField(term166289, term166289.getClass(), "playedUserName2", "fTVsHSQKPY");
        setIntField(term166289, term166289.getClass(), "playedMusicLevel2", -1759124858);
        setLongField(term166289, term166289.getClass(), "playedUserId3", -4208738507614245483L);
        setField(term166289, term166289.getClass(), "playedUserName3", "PmiKCfPhji");
        setIntField(term166289, term166289.getClass(), "playedMusicLevel3", 114661491);
        setIntField(term166289, term166289.getClass(), "achievement", 1977146061);
        setIntField(term166289, term166289.getClass(), "score", -910345480);
        setIntField(term166289, term166289.getClass(), "tapScore", 1882595560);
        setIntField(term166289, term166289.getClass(), "holdScore", 100456961);
        setIntField(term166289, term166289.getClass(), "slideScore", -802287779);
        setIntField(term166289, term166289.getClass(), "breakScore", 2078570305);
        setIntField(term166289, term166289.getClass(), "syncRate", -6623488);
        setIntField(term166289, term166289.getClass(), "vsWin", 1610278519);
        setBooleanField(term166289, term166289.getClass(), "isAllPerfect", true);
        setIntField(term166289, term166289.getClass(), "fullCombo", -1772985081);
        setIntField(term166289, term166289.getClass(), "maxFever", 611529690);
        setIntField(term166289, term166289.getClass(), "maxCombo", 267662254);
        setIntField(term166289, term166289.getClass(), "tapPerfect", -1719686239);
        setIntField(term166289, term166289.getClass(), "tapGreat", 1090114980);
        setIntField(term166289, term166289.getClass(), "tapGood", -927503426);
        setIntField(term166289, term166289.getClass(), "tapBad", -2108990309);
        setIntField(term166289, term166289.getClass(), "holdPerfect", -1185127412);
        setIntField(term166289, term166289.getClass(), "holdGreat", -243501649);
        setIntField(term166289, term166289.getClass(), "holdGood", 752825980);
        setIntField(term166289, term166289.getClass(), "holdBad", -572843395);
        setIntField(term166289, term166289.getClass(), "slidePerfect", 2053363712);
        setIntField(term166289, term166289.getClass(), "slideGreat", -1583524824);
        setIntField(term166289, term166289.getClass(), "slideGood", -151194547);
        setIntField(term166289, term166289.getClass(), "slideBad", -220193383);
        setIntField(term166289, term166289.getClass(), "breakPerfect", 1767455149);
        setIntField(term166289, term166289.getClass(), "breakGreat", -1811614533);
        setIntField(term166289, term166289.getClass(), "breakGood", 1847175017);
        setIntField(term166289, term166289.getClass(), "breakBad", -484796791);
        setBooleanField(term166289, term166289.getClass(), "isTrackSkip", true);
        setBooleanField(term166289, term166289.getClass(), "isHighScore", true);
        setBooleanField(term166289, term166289.getClass(), "isChallengeTrack", true);
        setIntField(term166289, term166289.getClass(), "challengeLife", -1972105053);
        setIntField(term166289, term166289.getClass(), "challengeRemain", -102315999);
        setIntField(term166289, term166289.getClass(), "isAllPerfectPlus", 1610813077);
        term166601 = new Integer(-18841793);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term166601;
        callMethod(klass, "setBreakGreat", argTypes, term166289, args);
    }

};


