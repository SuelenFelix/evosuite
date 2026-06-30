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

public class UserPlaylog_isTrackSkip_143318146755 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term138351;

    public UserPlaylog_isTrackSkip_143318146755() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term138357 = new Long(-1750555031444556464L);
        term138351 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term138353 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term138355 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term138371 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term138372 = newInstance(Class.forName("java.time.LocalDate"));
        Object term138376 = newInstance(Class.forName("java.time.LocalTime"));
        Object term138381 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term138382 = newInstance(Class.forName("java.time.LocalDate"));
        Object term138386 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term138351, term138351.getClass(), "id", -815959191072093025L);
        setLongField(term138353, term138353.getClass(), "id", 1118770099037757943L);
        setLongField(term138355, term138355.getClass(), "id", 8084091396945491294L);
        setField(term138355, term138355.getClass(), "extId", term138357);
        setField(term138355, term138355.getClass(), "luid", "WdAMelVmvU");
        setIntField(term138372, term138372.getClass(), "year", 2024);
        setShortField(term138372, term138372.getClass(), "month", (short) 9);
        setShortField(term138372, term138372.getClass(), "day", (short) 8);
        setField(term138371, term138371.getClass(), "date", term138372);
        setByteField(term138376, term138376.getClass(), "hour", (byte) 6);
        setByteField(term138376, term138376.getClass(), "minute", (byte) 3);
        setByteField(term138376, term138376.getClass(), "second", (byte) 52);
        setIntField(term138376, term138376.getClass(), "nano", 511733450);
        setField(term138371, term138371.getClass(), "time", term138376);
        setField(term138355, term138355.getClass(), "registerTime", term138371);
        setIntField(term138382, term138382.getClass(), "year", 2015);
        setShortField(term138382, term138382.getClass(), "month", (short) 1);
        setShortField(term138382, term138382.getClass(), "day", (short) 25);
        setField(term138381, term138381.getClass(), "date", term138382);
        setByteField(term138386, term138386.getClass(), "hour", (byte) 16);
        setByteField(term138386, term138386.getClass(), "minute", (byte) 22);
        setByteField(term138386, term138386.getClass(), "second", (byte) 44);
        setIntField(term138386, term138386.getClass(), "nano", 980528775);
        setField(term138381, term138381.getClass(), "time", term138386);
        setField(term138355, term138355.getClass(), "accessTime", term138381);
        setField(term138353, term138353.getClass(), "card", term138355);
        setIntField(term138353, term138353.getClass(), "lastDataVersion", -190908885);
        setField(term138353, term138353.getClass(), "userName", "FSZMcVNHZZ");
        setIntField(term138353, term138353.getClass(), "point", 1911297520);
        setIntField(term138353, term138353.getClass(), "totalPoint", -225566847);
        setIntField(term138353, term138353.getClass(), "iconId", 444454670);
        setIntField(term138353, term138353.getClass(), "nameplateId", -509189366);
        setIntField(term138353, term138353.getClass(), "frameId", 844615014);
        setIntField(term138353, term138353.getClass(), "trophyId", -1020310512);
        setIntField(term138353, term138353.getClass(), "playCount", -782250781);
        setIntField(term138353, term138353.getClass(), "playVsCount", 1073429923);
        setIntField(term138353, term138353.getClass(), "playSyncCount", -2000318351);
        setIntField(term138353, term138353.getClass(), "winCount", -546143038);
        setIntField(term138353, term138353.getClass(), "helpCount", -438943320);
        setIntField(term138353, term138353.getClass(), "comboCount", -963703305);
        setIntField(term138353, term138353.getClass(), "feverCount", -1575517096);
        setIntField(term138353, term138353.getClass(), "totalHiScore", -1555155741);
        setIntField(term138353, term138353.getClass(), "totalEasyHighScore", -843128749);
        setIntField(term138353, term138353.getClass(), "totalBasicHighScore", -50966948);
        setIntField(term138353, term138353.getClass(), "totalAdvancedHighScore", -577117972);
        setIntField(term138353, term138353.getClass(), "totalExpertHighScore", 249389565);
        setIntField(term138353, term138353.getClass(), "totalMasterHighScore", 1948918019);
        setIntField(term138353, term138353.getClass(), "totalReMasterHighScore", 1600591455);
        setIntField(term138353, term138353.getClass(), "totalHighSync", 808094613);
        setIntField(term138353, term138353.getClass(), "totalEasySync", -503272617);
        setIntField(term138353, term138353.getClass(), "totalBasicSync", -1473729491);
        setIntField(term138353, term138353.getClass(), "totalAdvancedSync", -1623388187);
        setIntField(term138353, term138353.getClass(), "totalExpertSync", 1607913383);
        setIntField(term138353, term138353.getClass(), "totalMasterSync", 2006007230);
        setIntField(term138353, term138353.getClass(), "totalReMasterSync", -382780133);
        setIntField(term138353, term138353.getClass(), "playerRating", -1041950061);
        setIntField(term138353, term138353.getClass(), "highestRating", 992724986);
        setIntField(term138353, term138353.getClass(), "rankAuthTailId", 1038663559);
        setField(term138353, term138353.getClass(), "eventWatchedDate", "uasckiUYzs");
        setField(term138353, term138353.getClass(), "webLimitDate", "dyPJplpZGY");
        setIntField(term138353, term138353.getClass(), "challengeTrackPhase", -491669609);
        setIntField(term138353, term138353.getClass(), "firstPlayBits", 827670895);
        setField(term138353, term138353.getClass(), "lastPlayDate", "FidoqFOZww");
        setIntField(term138353, term138353.getClass(), "lastPlaceId", 237718968);
        setField(term138353, term138353.getClass(), "lastPlaceName", "VthnTywRxB");
        setIntField(term138353, term138353.getClass(), "lastRegionId", -1792182061);
        setField(term138353, term138353.getClass(), "lastRegionName", "yHLHaopFRB");
        setField(term138353, term138353.getClass(), "lastClientId", "dYnLcyZTKV");
        setField(term138353, term138353.getClass(), "lastCountryCode", "EuhpauGeVe");
        setIntField(term138353, term138353.getClass(), "eventPoint", -1787992861);
        setIntField(term138353, term138353.getClass(), "totalLv", -866392377);
        setIntField(term138353, term138353.getClass(), "lastLoginBonusDay", -476020616);
        setIntField(term138353, term138353.getClass(), "lastSurvivalBonusDay", 1560427540);
        setIntField(term138353, term138353.getClass(), "loginBonusLv", -2014999573);
        setField(term138351, term138351.getClass(), "user", term138353);
        setIntField(term138351, term138351.getClass(), "orderId", -463779247);
        setLongField(term138351, term138351.getClass(), "sortNumber", -4010221274821200437L);
        setIntField(term138351, term138351.getClass(), "placeId", -374588532);
        setField(term138351, term138351.getClass(), "placeName", "kgFJtzMrPn");
        setField(term138351, term138351.getClass(), "country", "NIkocNvjmy");
        setIntField(term138351, term138351.getClass(), "regionId", -147991856);
        setField(term138351, term138351.getClass(), "playDate", "slAGCmeSHy");
        setField(term138351, term138351.getClass(), "userPlayDate", "DRgskGEoHQ");
        setIntField(term138351, term138351.getClass(), "musicId", -1877681987);
        setIntField(term138351, term138351.getClass(), "level", 2008337811);
        setIntField(term138351, term138351.getClass(), "gameMode", 1964182678);
        setIntField(term138351, term138351.getClass(), "rivalNum", 1673917093);
        setIntField(term138351, term138351.getClass(), "track", -1047967944);
        setIntField(term138351, term138351.getClass(), "eventId", 511285893);
        setBooleanField(term138351, term138351.getClass(), "isFreeToPlay", false);
        setIntField(term138351, term138351.getClass(), "playerRating", 1432059745);
        setLongField(term138351, term138351.getClass(), "playedUserId1", 802806007271882853L);
        setField(term138351, term138351.getClass(), "playedUserName1", "EnWOFmweOs");
        setIntField(term138351, term138351.getClass(), "playedMusicLevel1", 161873548);
        setLongField(term138351, term138351.getClass(), "playedUserId2", -687030958964015701L);
        setField(term138351, term138351.getClass(), "playedUserName2", "kBoIUinjBw");
        setIntField(term138351, term138351.getClass(), "playedMusicLevel2", -1673034493);
        setLongField(term138351, term138351.getClass(), "playedUserId3", -6658692066502742692L);
        setField(term138351, term138351.getClass(), "playedUserName3", "DrCWSqTYSn");
        setIntField(term138351, term138351.getClass(), "playedMusicLevel3", 808226931);
        setIntField(term138351, term138351.getClass(), "achievement", 1030017773);
        setIntField(term138351, term138351.getClass(), "score", -340125599);
        setIntField(term138351, term138351.getClass(), "tapScore", -852623679);
        setIntField(term138351, term138351.getClass(), "holdScore", -272917720);
        setIntField(term138351, term138351.getClass(), "slideScore", 235629515);
        setIntField(term138351, term138351.getClass(), "breakScore", 1831552674);
        setIntField(term138351, term138351.getClass(), "syncRate", 660540546);
        setIntField(term138351, term138351.getClass(), "vsWin", -1265313720);
        setBooleanField(term138351, term138351.getClass(), "isAllPerfect", false);
        setIntField(term138351, term138351.getClass(), "fullCombo", -2081318997);
        setIntField(term138351, term138351.getClass(), "maxFever", 1409397366);
        setIntField(term138351, term138351.getClass(), "maxCombo", 717025660);
        setIntField(term138351, term138351.getClass(), "tapPerfect", 1730031357);
        setIntField(term138351, term138351.getClass(), "tapGreat", -1411877325);
        setIntField(term138351, term138351.getClass(), "tapGood", -1348582927);
        setIntField(term138351, term138351.getClass(), "tapBad", -1795579142);
        setIntField(term138351, term138351.getClass(), "holdPerfect", 1914453462);
        setIntField(term138351, term138351.getClass(), "holdGreat", 727587601);
        setIntField(term138351, term138351.getClass(), "holdGood", 1723667094);
        setIntField(term138351, term138351.getClass(), "holdBad", 2087160467);
        setIntField(term138351, term138351.getClass(), "slidePerfect", -603995413);
        setIntField(term138351, term138351.getClass(), "slideGreat", -877445805);
        setIntField(term138351, term138351.getClass(), "slideGood", -70871011);
        setIntField(term138351, term138351.getClass(), "slideBad", 483899295);
        setIntField(term138351, term138351.getClass(), "breakPerfect", 1356784196);
        setIntField(term138351, term138351.getClass(), "breakGreat", 1244399605);
        setIntField(term138351, term138351.getClass(), "breakGood", 374170485);
        setIntField(term138351, term138351.getClass(), "breakBad", 1386558439);
        setBooleanField(term138351, term138351.getClass(), "isTrackSkip", true);
        setBooleanField(term138351, term138351.getClass(), "isHighScore", false);
        setBooleanField(term138351, term138351.getClass(), "isChallengeTrack", true);
        setIntField(term138351, term138351.getClass(), "challengeLife", -497947013);
        setIntField(term138351, term138351.getClass(), "challengeRemain", -1800085573);
        setIntField(term138351, term138351.getClass(), "isAllPerfectPlus", 1643304459);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isTrackSkip", argTypes, term138351, args);
    }

};


