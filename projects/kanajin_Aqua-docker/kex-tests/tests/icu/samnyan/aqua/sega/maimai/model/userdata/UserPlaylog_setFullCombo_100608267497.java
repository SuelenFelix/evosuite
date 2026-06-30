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

public class UserPlaylog_setFullCombo_100608267497 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term158649;
     Object term158961;

    public UserPlaylog_setFullCombo_100608267497() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term158655 = new Long(77619432202128806L);
        term158649 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term158651 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term158653 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term158669 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term158670 = newInstance(Class.forName("java.time.LocalDate"));
        Object term158674 = newInstance(Class.forName("java.time.LocalTime"));
        Object term158679 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term158680 = newInstance(Class.forName("java.time.LocalDate"));
        Object term158684 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term158649, term158649.getClass(), "id", 8104096721239680583L);
        setLongField(term158651, term158651.getClass(), "id", 1132566737750531256L);
        setLongField(term158653, term158653.getClass(), "id", -3777136467668448199L);
        setField(term158653, term158653.getClass(), "extId", term158655);
        setField(term158653, term158653.getClass(), "luid", "KfyRZmwblA");
        setIntField(term158670, term158670.getClass(), "year", 2013);
        setShortField(term158670, term158670.getClass(), "month", (short) 3);
        setShortField(term158670, term158670.getClass(), "day", (short) 23);
        setField(term158669, term158669.getClass(), "date", term158670);
        setByteField(term158674, term158674.getClass(), "hour", (byte) 11);
        setByteField(term158674, term158674.getClass(), "minute", (byte) 19);
        setByteField(term158674, term158674.getClass(), "second", (byte) 49);
        setIntField(term158674, term158674.getClass(), "nano", 671462460);
        setField(term158669, term158669.getClass(), "time", term158674);
        setField(term158653, term158653.getClass(), "registerTime", term158669);
        setIntField(term158680, term158680.getClass(), "year", 2025);
        setShortField(term158680, term158680.getClass(), "month", (short) 5);
        setShortField(term158680, term158680.getClass(), "day", (short) 12);
        setField(term158679, term158679.getClass(), "date", term158680);
        setByteField(term158684, term158684.getClass(), "hour", (byte) 14);
        setByteField(term158684, term158684.getClass(), "minute", (byte) 27);
        setByteField(term158684, term158684.getClass(), "second", (byte) 18);
        setIntField(term158684, term158684.getClass(), "nano", 530044969);
        setField(term158679, term158679.getClass(), "time", term158684);
        setField(term158653, term158653.getClass(), "accessTime", term158679);
        setField(term158651, term158651.getClass(), "card", term158653);
        setIntField(term158651, term158651.getClass(), "lastDataVersion", -1728880385);
        setField(term158651, term158651.getClass(), "userName", "uBFesOdlOQ");
        setIntField(term158651, term158651.getClass(), "point", 258346985);
        setIntField(term158651, term158651.getClass(), "totalPoint", 740436525);
        setIntField(term158651, term158651.getClass(), "iconId", -917248016);
        setIntField(term158651, term158651.getClass(), "nameplateId", 859049236);
        setIntField(term158651, term158651.getClass(), "frameId", 1834375406);
        setIntField(term158651, term158651.getClass(), "trophyId", 1796769631);
        setIntField(term158651, term158651.getClass(), "playCount", -781796868);
        setIntField(term158651, term158651.getClass(), "playVsCount", -1854861178);
        setIntField(term158651, term158651.getClass(), "playSyncCount", 1594565852);
        setIntField(term158651, term158651.getClass(), "winCount", 1640238796);
        setIntField(term158651, term158651.getClass(), "helpCount", -1522683775);
        setIntField(term158651, term158651.getClass(), "comboCount", 1180776013);
        setIntField(term158651, term158651.getClass(), "feverCount", -746015610);
        setIntField(term158651, term158651.getClass(), "totalHiScore", 923745459);
        setIntField(term158651, term158651.getClass(), "totalEasyHighScore", -1130552959);
        setIntField(term158651, term158651.getClass(), "totalBasicHighScore", 1534812995);
        setIntField(term158651, term158651.getClass(), "totalAdvancedHighScore", -1809063858);
        setIntField(term158651, term158651.getClass(), "totalExpertHighScore", -194387356);
        setIntField(term158651, term158651.getClass(), "totalMasterHighScore", 1843600084);
        setIntField(term158651, term158651.getClass(), "totalReMasterHighScore", -5174061);
        setIntField(term158651, term158651.getClass(), "totalHighSync", -1230742841);
        setIntField(term158651, term158651.getClass(), "totalEasySync", -1939415532);
        setIntField(term158651, term158651.getClass(), "totalBasicSync", -1043914893);
        setIntField(term158651, term158651.getClass(), "totalAdvancedSync", 1724704495);
        setIntField(term158651, term158651.getClass(), "totalExpertSync", -1115817572);
        setIntField(term158651, term158651.getClass(), "totalMasterSync", -153289743);
        setIntField(term158651, term158651.getClass(), "totalReMasterSync", -838732558);
        setIntField(term158651, term158651.getClass(), "playerRating", 322567495);
        setIntField(term158651, term158651.getClass(), "highestRating", 914041007);
        setIntField(term158651, term158651.getClass(), "rankAuthTailId", 1040995446);
        setField(term158651, term158651.getClass(), "eventWatchedDate", "mhZDVyKkRQ");
        setField(term158651, term158651.getClass(), "webLimitDate", "gUjPlBJpBX");
        setIntField(term158651, term158651.getClass(), "challengeTrackPhase", -1369029298);
        setIntField(term158651, term158651.getClass(), "firstPlayBits", 528919479);
        setField(term158651, term158651.getClass(), "lastPlayDate", "XsbZWCULaM");
        setIntField(term158651, term158651.getClass(), "lastPlaceId", 1434512261);
        setField(term158651, term158651.getClass(), "lastPlaceName", "SVgzmJdpqR");
        setIntField(term158651, term158651.getClass(), "lastRegionId", 2123021311);
        setField(term158651, term158651.getClass(), "lastRegionName", "iPeJOiWzhg");
        setField(term158651, term158651.getClass(), "lastClientId", "munlTtNamQ");
        setField(term158651, term158651.getClass(), "lastCountryCode", "DUpJkfRxDT");
        setIntField(term158651, term158651.getClass(), "eventPoint", 490412264);
        setIntField(term158651, term158651.getClass(), "totalLv", 1513761280);
        setIntField(term158651, term158651.getClass(), "lastLoginBonusDay", -1946742560);
        setIntField(term158651, term158651.getClass(), "lastSurvivalBonusDay", -1664149601);
        setIntField(term158651, term158651.getClass(), "loginBonusLv", -113939247);
        setField(term158649, term158649.getClass(), "user", term158651);
        setIntField(term158649, term158649.getClass(), "orderId", 214605498);
        setLongField(term158649, term158649.getClass(), "sortNumber", 6995079656219021769L);
        setIntField(term158649, term158649.getClass(), "placeId", 1703247021);
        setField(term158649, term158649.getClass(), "placeName", "LcoJdPibmE");
        setField(term158649, term158649.getClass(), "country", "HCkvHZWbSX");
        setIntField(term158649, term158649.getClass(), "regionId", 677161777);
        setField(term158649, term158649.getClass(), "playDate", "JVxVmSrZrh");
        setField(term158649, term158649.getClass(), "userPlayDate", "xHynRanbSE");
        setIntField(term158649, term158649.getClass(), "musicId", 964585800);
        setIntField(term158649, term158649.getClass(), "level", 820833673);
        setIntField(term158649, term158649.getClass(), "gameMode", 507620384);
        setIntField(term158649, term158649.getClass(), "rivalNum", 990688429);
        setIntField(term158649, term158649.getClass(), "track", 721943680);
        setIntField(term158649, term158649.getClass(), "eventId", 894874766);
        setBooleanField(term158649, term158649.getClass(), "isFreeToPlay", false);
        setIntField(term158649, term158649.getClass(), "playerRating", -236070883);
        setLongField(term158649, term158649.getClass(), "playedUserId1", 9105367613914646956L);
        setField(term158649, term158649.getClass(), "playedUserName1", "ACdUTXxFxF");
        setIntField(term158649, term158649.getClass(), "playedMusicLevel1", 1543891132);
        setLongField(term158649, term158649.getClass(), "playedUserId2", -2619427369277959894L);
        setField(term158649, term158649.getClass(), "playedUserName2", "MsjtvLqctc");
        setIntField(term158649, term158649.getClass(), "playedMusicLevel2", -1639326299);
        setLongField(term158649, term158649.getClass(), "playedUserId3", -6961214062026278685L);
        setField(term158649, term158649.getClass(), "playedUserName3", "omhBZktFpR");
        setIntField(term158649, term158649.getClass(), "playedMusicLevel3", -2019676895);
        setIntField(term158649, term158649.getClass(), "achievement", 840784345);
        setIntField(term158649, term158649.getClass(), "score", -1630100339);
        setIntField(term158649, term158649.getClass(), "tapScore", 1973238817);
        setIntField(term158649, term158649.getClass(), "holdScore", 459989948);
        setIntField(term158649, term158649.getClass(), "slideScore", -936888895);
        setIntField(term158649, term158649.getClass(), "breakScore", -1994397463);
        setIntField(term158649, term158649.getClass(), "syncRate", -619864294);
        setIntField(term158649, term158649.getClass(), "vsWin", -2098889927);
        setBooleanField(term158649, term158649.getClass(), "isAllPerfect", false);
        setIntField(term158649, term158649.getClass(), "fullCombo", 303165594);
        setIntField(term158649, term158649.getClass(), "maxFever", 965505668);
        setIntField(term158649, term158649.getClass(), "maxCombo", 484030783);
        setIntField(term158649, term158649.getClass(), "tapPerfect", -1065095360);
        setIntField(term158649, term158649.getClass(), "tapGreat", -1792666903);
        setIntField(term158649, term158649.getClass(), "tapGood", -357530730);
        setIntField(term158649, term158649.getClass(), "tapBad", -1572391740);
        setIntField(term158649, term158649.getClass(), "holdPerfect", 1513294330);
        setIntField(term158649, term158649.getClass(), "holdGreat", 5176980);
        setIntField(term158649, term158649.getClass(), "holdGood", 556020394);
        setIntField(term158649, term158649.getClass(), "holdBad", -1290224726);
        setIntField(term158649, term158649.getClass(), "slidePerfect", -390790902);
        setIntField(term158649, term158649.getClass(), "slideGreat", -2125333816);
        setIntField(term158649, term158649.getClass(), "slideGood", -1762438474);
        setIntField(term158649, term158649.getClass(), "slideBad", -1960460221);
        setIntField(term158649, term158649.getClass(), "breakPerfect", 521694652);
        setIntField(term158649, term158649.getClass(), "breakGreat", -1117414883);
        setIntField(term158649, term158649.getClass(), "breakGood", -1801762710);
        setIntField(term158649, term158649.getClass(), "breakBad", -846738955);
        setBooleanField(term158649, term158649.getClass(), "isTrackSkip", false);
        setBooleanField(term158649, term158649.getClass(), "isHighScore", true);
        setBooleanField(term158649, term158649.getClass(), "isChallengeTrack", false);
        setIntField(term158649, term158649.getClass(), "challengeLife", 1151997055);
        setIntField(term158649, term158649.getClass(), "challengeRemain", 1833295608);
        setIntField(term158649, term158649.getClass(), "isAllPerfectPlus", -1031774004);
        term158961 = new Integer(1204374078);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term158961;
        callMethod(klass, "setFullCombo", argTypes, term158649, args);
    }

};


