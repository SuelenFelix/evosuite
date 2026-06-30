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

public class UserPlaylog_getGameMode_175001325412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118055;

    public UserPlaylog_getGameMode_175001325412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term118061 = new Long(-8692119547314358088L);
        term118055 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term118057 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term118059 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term118075 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term118076 = newInstance(Class.forName("java.time.LocalDate"));
        Object term118080 = newInstance(Class.forName("java.time.LocalTime"));
        Object term118085 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term118086 = newInstance(Class.forName("java.time.LocalDate"));
        Object term118090 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term118055, term118055.getClass(), "id", -6573442531269156325L);
        setLongField(term118057, term118057.getClass(), "id", -2326118746160954215L);
        setLongField(term118059, term118059.getClass(), "id", 6091220404570069089L);
        setField(term118059, term118059.getClass(), "extId", term118061);
        setField(term118059, term118059.getClass(), "luid", "DbGJbEhLhl");
        setIntField(term118076, term118076.getClass(), "year", 2018);
        setShortField(term118076, term118076.getClass(), "month", (short) 10);
        setShortField(term118076, term118076.getClass(), "day", (short) 20);
        setField(term118075, term118075.getClass(), "date", term118076);
        setByteField(term118080, term118080.getClass(), "hour", (byte) 3);
        setByteField(term118080, term118080.getClass(), "minute", (byte) 46);
        setByteField(term118080, term118080.getClass(), "second", (byte) 11);
        setIntField(term118080, term118080.getClass(), "nano", 355046607);
        setField(term118075, term118075.getClass(), "time", term118080);
        setField(term118059, term118059.getClass(), "registerTime", term118075);
        setIntField(term118086, term118086.getClass(), "year", 2021);
        setShortField(term118086, term118086.getClass(), "month", (short) 6);
        setShortField(term118086, term118086.getClass(), "day", (short) 25);
        setField(term118085, term118085.getClass(), "date", term118086);
        setByteField(term118090, term118090.getClass(), "hour", (byte) 14);
        setByteField(term118090, term118090.getClass(), "minute", (byte) 46);
        setByteField(term118090, term118090.getClass(), "second", (byte) 35);
        setIntField(term118090, term118090.getClass(), "nano", 585866950);
        setField(term118085, term118085.getClass(), "time", term118090);
        setField(term118059, term118059.getClass(), "accessTime", term118085);
        setField(term118057, term118057.getClass(), "card", term118059);
        setIntField(term118057, term118057.getClass(), "lastDataVersion", -1881174954);
        setField(term118057, term118057.getClass(), "userName", "BGxrtAjHqX");
        setIntField(term118057, term118057.getClass(), "point", 1293357935);
        setIntField(term118057, term118057.getClass(), "totalPoint", -2045621604);
        setIntField(term118057, term118057.getClass(), "iconId", -1766346007);
        setIntField(term118057, term118057.getClass(), "nameplateId", 2046694425);
        setIntField(term118057, term118057.getClass(), "frameId", 1066418317);
        setIntField(term118057, term118057.getClass(), "trophyId", 298705041);
        setIntField(term118057, term118057.getClass(), "playCount", -840203357);
        setIntField(term118057, term118057.getClass(), "playVsCount", -352051215);
        setIntField(term118057, term118057.getClass(), "playSyncCount", -1979481664);
        setIntField(term118057, term118057.getClass(), "winCount", -365906918);
        setIntField(term118057, term118057.getClass(), "helpCount", 2117549900);
        setIntField(term118057, term118057.getClass(), "comboCount", -1249760569);
        setIntField(term118057, term118057.getClass(), "feverCount", -363328051);
        setIntField(term118057, term118057.getClass(), "totalHiScore", 1705359533);
        setIntField(term118057, term118057.getClass(), "totalEasyHighScore", -1282832295);
        setIntField(term118057, term118057.getClass(), "totalBasicHighScore", -1520422396);
        setIntField(term118057, term118057.getClass(), "totalAdvancedHighScore", 1249417434);
        setIntField(term118057, term118057.getClass(), "totalExpertHighScore", -993162730);
        setIntField(term118057, term118057.getClass(), "totalMasterHighScore", -1006811892);
        setIntField(term118057, term118057.getClass(), "totalReMasterHighScore", -1072459125);
        setIntField(term118057, term118057.getClass(), "totalHighSync", -994729899);
        setIntField(term118057, term118057.getClass(), "totalEasySync", 246912139);
        setIntField(term118057, term118057.getClass(), "totalBasicSync", -1197365259);
        setIntField(term118057, term118057.getClass(), "totalAdvancedSync", -350142230);
        setIntField(term118057, term118057.getClass(), "totalExpertSync", 1873154325);
        setIntField(term118057, term118057.getClass(), "totalMasterSync", 368912893);
        setIntField(term118057, term118057.getClass(), "totalReMasterSync", 1352383675);
        setIntField(term118057, term118057.getClass(), "playerRating", 579784907);
        setIntField(term118057, term118057.getClass(), "highestRating", -1880511554);
        setIntField(term118057, term118057.getClass(), "rankAuthTailId", -1830283088);
        setField(term118057, term118057.getClass(), "eventWatchedDate", "ABkOTQedzY");
        setField(term118057, term118057.getClass(), "webLimitDate", "EFsPqsIRQv");
        setIntField(term118057, term118057.getClass(), "challengeTrackPhase", -145916644);
        setIntField(term118057, term118057.getClass(), "firstPlayBits", 1008205744);
        setField(term118057, term118057.getClass(), "lastPlayDate", "SLJrzKBPdq");
        setIntField(term118057, term118057.getClass(), "lastPlaceId", -964506776);
        setField(term118057, term118057.getClass(), "lastPlaceName", "TanVvFPLln");
        setIntField(term118057, term118057.getClass(), "lastRegionId", -548169971);
        setField(term118057, term118057.getClass(), "lastRegionName", "IDakEXhNfN");
        setField(term118057, term118057.getClass(), "lastClientId", "zuVCIcZmHu");
        setField(term118057, term118057.getClass(), "lastCountryCode", "TOgWyfMILX");
        setIntField(term118057, term118057.getClass(), "eventPoint", 376091185);
        setIntField(term118057, term118057.getClass(), "totalLv", 1059436255);
        setIntField(term118057, term118057.getClass(), "lastLoginBonusDay", -709660030);
        setIntField(term118057, term118057.getClass(), "lastSurvivalBonusDay", -57698122);
        setIntField(term118057, term118057.getClass(), "loginBonusLv", -1666963978);
        setField(term118055, term118055.getClass(), "user", term118057);
        setIntField(term118055, term118055.getClass(), "orderId", -1478575974);
        setLongField(term118055, term118055.getClass(), "sortNumber", 8116689826697820264L);
        setIntField(term118055, term118055.getClass(), "placeId", -291257868);
        setField(term118055, term118055.getClass(), "placeName", "FqpUNAOtmF");
        setField(term118055, term118055.getClass(), "country", "SpILHdKTKK");
        setIntField(term118055, term118055.getClass(), "regionId", 1065083099);
        setField(term118055, term118055.getClass(), "playDate", "LklQRqbChE");
        setField(term118055, term118055.getClass(), "userPlayDate", "wxbPKcvjhX");
        setIntField(term118055, term118055.getClass(), "musicId", 1427499273);
        setIntField(term118055, term118055.getClass(), "level", -59151213);
        setIntField(term118055, term118055.getClass(), "gameMode", -707379580);
        setIntField(term118055, term118055.getClass(), "rivalNum", -57580085);
        setIntField(term118055, term118055.getClass(), "track", -1154633550);
        setIntField(term118055, term118055.getClass(), "eventId", 578387870);
        setBooleanField(term118055, term118055.getClass(), "isFreeToPlay", false);
        setIntField(term118055, term118055.getClass(), "playerRating", -573536134);
        setLongField(term118055, term118055.getClass(), "playedUserId1", 6594952836231202437L);
        setField(term118055, term118055.getClass(), "playedUserName1", "RmyltMpQEu");
        setIntField(term118055, term118055.getClass(), "playedMusicLevel1", 1508235726);
        setLongField(term118055, term118055.getClass(), "playedUserId2", -6888944543104457634L);
        setField(term118055, term118055.getClass(), "playedUserName2", "ozlDkmzKuq");
        setIntField(term118055, term118055.getClass(), "playedMusicLevel2", -1903521501);
        setLongField(term118055, term118055.getClass(), "playedUserId3", 3965773362038690712L);
        setField(term118055, term118055.getClass(), "playedUserName3", "oGDeaReDRG");
        setIntField(term118055, term118055.getClass(), "playedMusicLevel3", 83577512);
        setIntField(term118055, term118055.getClass(), "achievement", -190486139);
        setIntField(term118055, term118055.getClass(), "score", -1583452879);
        setIntField(term118055, term118055.getClass(), "tapScore", 1252497408);
        setIntField(term118055, term118055.getClass(), "holdScore", -1193659161);
        setIntField(term118055, term118055.getClass(), "slideScore", 611802335);
        setIntField(term118055, term118055.getClass(), "breakScore", -117170783);
        setIntField(term118055, term118055.getClass(), "syncRate", 1396116256);
        setIntField(term118055, term118055.getClass(), "vsWin", 782140754);
        setBooleanField(term118055, term118055.getClass(), "isAllPerfect", false);
        setIntField(term118055, term118055.getClass(), "fullCombo", -1361513040);
        setIntField(term118055, term118055.getClass(), "maxFever", -1061345604);
        setIntField(term118055, term118055.getClass(), "maxCombo", -1473491051);
        setIntField(term118055, term118055.getClass(), "tapPerfect", 804411219);
        setIntField(term118055, term118055.getClass(), "tapGreat", -1184708689);
        setIntField(term118055, term118055.getClass(), "tapGood", 1859413989);
        setIntField(term118055, term118055.getClass(), "tapBad", 399424745);
        setIntField(term118055, term118055.getClass(), "holdPerfect", 1445242555);
        setIntField(term118055, term118055.getClass(), "holdGreat", -1658014193);
        setIntField(term118055, term118055.getClass(), "holdGood", -730803369);
        setIntField(term118055, term118055.getClass(), "holdBad", 2047860906);
        setIntField(term118055, term118055.getClass(), "slidePerfect", -2076399882);
        setIntField(term118055, term118055.getClass(), "slideGreat", -1118647144);
        setIntField(term118055, term118055.getClass(), "slideGood", 883702396);
        setIntField(term118055, term118055.getClass(), "slideBad", -1694239191);
        setIntField(term118055, term118055.getClass(), "breakPerfect", 1485756799);
        setIntField(term118055, term118055.getClass(), "breakGreat", 546047763);
        setIntField(term118055, term118055.getClass(), "breakGood", -1457910913);
        setIntField(term118055, term118055.getClass(), "breakBad", 855873150);
        setBooleanField(term118055, term118055.getClass(), "isTrackSkip", true);
        setBooleanField(term118055, term118055.getClass(), "isHighScore", true);
        setBooleanField(term118055, term118055.getClass(), "isChallengeTrack", true);
        setIntField(term118055, term118055.getClass(), "challengeLife", -756508779);
        setIntField(term118055, term118055.getClass(), "challengeRemain", 1499179754);
        setIntField(term118055, term118055.getClass(), "isAllPerfectPlus", 813945887);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGameMode", argTypes, term118055, args);
    }

};


