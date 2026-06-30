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

public class UserPlaylog_getUserPlayDate_11125177319 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term116639;

    public UserPlaylog_getUserPlayDate_11125177319() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term116645 = new Long(1353683663053784647L);
        term116639 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term116641 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term116643 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term116659 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term116660 = newInstance(Class.forName("java.time.LocalDate"));
        Object term116664 = newInstance(Class.forName("java.time.LocalTime"));
        Object term116669 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term116670 = newInstance(Class.forName("java.time.LocalDate"));
        Object term116674 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term116639, term116639.getClass(), "id", -4215965963361389968L);
        setLongField(term116641, term116641.getClass(), "id", 2070286321904569703L);
        setLongField(term116643, term116643.getClass(), "id", -3945232339387324807L);
        setField(term116643, term116643.getClass(), "extId", term116645);
        setField(term116643, term116643.getClass(), "luid", "VFWNaQoDnL");
        setIntField(term116660, term116660.getClass(), "year", 2029);
        setShortField(term116660, term116660.getClass(), "month", (short) 6);
        setShortField(term116660, term116660.getClass(), "day", (short) 2);
        setField(term116659, term116659.getClass(), "date", term116660);
        setByteField(term116664, term116664.getClass(), "hour", (byte) 7);
        setByteField(term116664, term116664.getClass(), "minute", (byte) 13);
        setByteField(term116664, term116664.getClass(), "second", (byte) 48);
        setIntField(term116664, term116664.getClass(), "nano", 642728132);
        setField(term116659, term116659.getClass(), "time", term116664);
        setField(term116643, term116643.getClass(), "registerTime", term116659);
        setIntField(term116670, term116670.getClass(), "year", 2010);
        setShortField(term116670, term116670.getClass(), "month", (short) 10);
        setShortField(term116670, term116670.getClass(), "day", (short) 8);
        setField(term116669, term116669.getClass(), "date", term116670);
        setByteField(term116674, term116674.getClass(), "hour", (byte) 6);
        setByteField(term116674, term116674.getClass(), "minute", (byte) 12);
        setByteField(term116674, term116674.getClass(), "second", (byte) 51);
        setIntField(term116674, term116674.getClass(), "nano", 851312829);
        setField(term116669, term116669.getClass(), "time", term116674);
        setField(term116643, term116643.getClass(), "accessTime", term116669);
        setField(term116641, term116641.getClass(), "card", term116643);
        setIntField(term116641, term116641.getClass(), "lastDataVersion", -100806416);
        setField(term116641, term116641.getClass(), "userName", "BFwtIJkozx");
        setIntField(term116641, term116641.getClass(), "point", -1060172488);
        setIntField(term116641, term116641.getClass(), "totalPoint", 191812624);
        setIntField(term116641, term116641.getClass(), "iconId", 1321788637);
        setIntField(term116641, term116641.getClass(), "nameplateId", -1233600149);
        setIntField(term116641, term116641.getClass(), "frameId", -2080709049);
        setIntField(term116641, term116641.getClass(), "trophyId", 148521677);
        setIntField(term116641, term116641.getClass(), "playCount", 2029502457);
        setIntField(term116641, term116641.getClass(), "playVsCount", -171777022);
        setIntField(term116641, term116641.getClass(), "playSyncCount", 1235568553);
        setIntField(term116641, term116641.getClass(), "winCount", 1684825497);
        setIntField(term116641, term116641.getClass(), "helpCount", 502790478);
        setIntField(term116641, term116641.getClass(), "comboCount", -1072344219);
        setIntField(term116641, term116641.getClass(), "feverCount", -2005106192);
        setIntField(term116641, term116641.getClass(), "totalHiScore", -555377710);
        setIntField(term116641, term116641.getClass(), "totalEasyHighScore", 280612930);
        setIntField(term116641, term116641.getClass(), "totalBasicHighScore", 993414549);
        setIntField(term116641, term116641.getClass(), "totalAdvancedHighScore", 2138835033);
        setIntField(term116641, term116641.getClass(), "totalExpertHighScore", -2040339650);
        setIntField(term116641, term116641.getClass(), "totalMasterHighScore", -1201443594);
        setIntField(term116641, term116641.getClass(), "totalReMasterHighScore", 49361066);
        setIntField(term116641, term116641.getClass(), "totalHighSync", -1429526464);
        setIntField(term116641, term116641.getClass(), "totalEasySync", 1223961715);
        setIntField(term116641, term116641.getClass(), "totalBasicSync", 240428767);
        setIntField(term116641, term116641.getClass(), "totalAdvancedSync", 495648720);
        setIntField(term116641, term116641.getClass(), "totalExpertSync", -1601485867);
        setIntField(term116641, term116641.getClass(), "totalMasterSync", 1998131577);
        setIntField(term116641, term116641.getClass(), "totalReMasterSync", -796385132);
        setIntField(term116641, term116641.getClass(), "playerRating", 764130450);
        setIntField(term116641, term116641.getClass(), "highestRating", 88245264);
        setIntField(term116641, term116641.getClass(), "rankAuthTailId", 1442828973);
        setField(term116641, term116641.getClass(), "eventWatchedDate", "cIMeTiVeEp");
        setField(term116641, term116641.getClass(), "webLimitDate", "aUqkaiSINd");
        setIntField(term116641, term116641.getClass(), "challengeTrackPhase", 935972072);
        setIntField(term116641, term116641.getClass(), "firstPlayBits", 150265946);
        setField(term116641, term116641.getClass(), "lastPlayDate", "IVtVcsDYoX");
        setIntField(term116641, term116641.getClass(), "lastPlaceId", 1626027490);
        setField(term116641, term116641.getClass(), "lastPlaceName", "GgQFLRdyzF");
        setIntField(term116641, term116641.getClass(), "lastRegionId", -1464025625);
        setField(term116641, term116641.getClass(), "lastRegionName", "irKkxyVwDT");
        setField(term116641, term116641.getClass(), "lastClientId", "vCUIiQSkZO");
        setField(term116641, term116641.getClass(), "lastCountryCode", "oAVrawlRsA");
        setIntField(term116641, term116641.getClass(), "eventPoint", 2015899963);
        setIntField(term116641, term116641.getClass(), "totalLv", 679633464);
        setIntField(term116641, term116641.getClass(), "lastLoginBonusDay", 696207020);
        setIntField(term116641, term116641.getClass(), "lastSurvivalBonusDay", -764517409);
        setIntField(term116641, term116641.getClass(), "loginBonusLv", -1031341811);
        setField(term116639, term116639.getClass(), "user", term116641);
        setIntField(term116639, term116639.getClass(), "orderId", 1746547938);
        setLongField(term116639, term116639.getClass(), "sortNumber", -5824480506846704461L);
        setIntField(term116639, term116639.getClass(), "placeId", -1990552588);
        setField(term116639, term116639.getClass(), "placeName", "jVdmaiSLFy");
        setField(term116639, term116639.getClass(), "country", "QySSrixSJt");
        setIntField(term116639, term116639.getClass(), "regionId", 866467788);
        setField(term116639, term116639.getClass(), "playDate", "UgIqArPAat");
        setField(term116639, term116639.getClass(), "userPlayDate", "cAfXSAOdaf");
        setIntField(term116639, term116639.getClass(), "musicId", -309416237);
        setIntField(term116639, term116639.getClass(), "level", -1872979717);
        setIntField(term116639, term116639.getClass(), "gameMode", 1715864149);
        setIntField(term116639, term116639.getClass(), "rivalNum", -508840627);
        setIntField(term116639, term116639.getClass(), "track", -207704563);
        setIntField(term116639, term116639.getClass(), "eventId", -661250152);
        setBooleanField(term116639, term116639.getClass(), "isFreeToPlay", false);
        setIntField(term116639, term116639.getClass(), "playerRating", 1420332983);
        setLongField(term116639, term116639.getClass(), "playedUserId1", 3429445910087803709L);
        setField(term116639, term116639.getClass(), "playedUserName1", "gFWxmEVAsk");
        setIntField(term116639, term116639.getClass(), "playedMusicLevel1", 682985613);
        setLongField(term116639, term116639.getClass(), "playedUserId2", 6844542874326058740L);
        setField(term116639, term116639.getClass(), "playedUserName2", "LmtyEJAnHW");
        setIntField(term116639, term116639.getClass(), "playedMusicLevel2", 2335384);
        setLongField(term116639, term116639.getClass(), "playedUserId3", -7486371039960699202L);
        setField(term116639, term116639.getClass(), "playedUserName3", "KPFNRywlFG");
        setIntField(term116639, term116639.getClass(), "playedMusicLevel3", -2073470721);
        setIntField(term116639, term116639.getClass(), "achievement", 1081791680);
        setIntField(term116639, term116639.getClass(), "score", 818689185);
        setIntField(term116639, term116639.getClass(), "tapScore", 1510353216);
        setIntField(term116639, term116639.getClass(), "holdScore", 2040409009);
        setIntField(term116639, term116639.getClass(), "slideScore", 778873226);
        setIntField(term116639, term116639.getClass(), "breakScore", -88095693);
        setIntField(term116639, term116639.getClass(), "syncRate", 1745511833);
        setIntField(term116639, term116639.getClass(), "vsWin", -186574934);
        setBooleanField(term116639, term116639.getClass(), "isAllPerfect", false);
        setIntField(term116639, term116639.getClass(), "fullCombo", 41148822);
        setIntField(term116639, term116639.getClass(), "maxFever", 79302757);
        setIntField(term116639, term116639.getClass(), "maxCombo", -1070423794);
        setIntField(term116639, term116639.getClass(), "tapPerfect", -1340282394);
        setIntField(term116639, term116639.getClass(), "tapGreat", 1626755839);
        setIntField(term116639, term116639.getClass(), "tapGood", -1483961873);
        setIntField(term116639, term116639.getClass(), "tapBad", 1774470970);
        setIntField(term116639, term116639.getClass(), "holdPerfect", -289561561);
        setIntField(term116639, term116639.getClass(), "holdGreat", -1540317966);
        setIntField(term116639, term116639.getClass(), "holdGood", 1957621898);
        setIntField(term116639, term116639.getClass(), "holdBad", -2085629066);
        setIntField(term116639, term116639.getClass(), "slidePerfect", 332635381);
        setIntField(term116639, term116639.getClass(), "slideGreat", 1402888541);
        setIntField(term116639, term116639.getClass(), "slideGood", -77095792);
        setIntField(term116639, term116639.getClass(), "slideBad", -2079226958);
        setIntField(term116639, term116639.getClass(), "breakPerfect", -386074);
        setIntField(term116639, term116639.getClass(), "breakGreat", 1447028198);
        setIntField(term116639, term116639.getClass(), "breakGood", -1208205597);
        setIntField(term116639, term116639.getClass(), "breakBad", 2055857288);
        setBooleanField(term116639, term116639.getClass(), "isTrackSkip", true);
        setBooleanField(term116639, term116639.getClass(), "isHighScore", true);
        setBooleanField(term116639, term116639.getClass(), "isChallengeTrack", true);
        setIntField(term116639, term116639.getClass(), "challengeLife", 1498740255);
        setIntField(term116639, term116639.getClass(), "challengeRemain", 904155166);
        setIntField(term116639, term116639.getClass(), "isAllPerfectPlus", 72629006);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserPlayDate", argTypes, term116639, args);
    }

};


