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

public class UserPlaylog_setMaxCombo_9409206799 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3985963;
     Object term3986275;

    public UserPlaylog_setMaxCombo_9409206799() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3985969 = new Long(2007181337265009846L);
        term3985963 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term3985965 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term3985967 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term3985983 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3985984 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3985988 = newInstance(Class.forName("java.time.LocalTime"));
        Object term3985993 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3985994 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3985998 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term3985963, term3985963.getClass(), "id", -7854345981692961717L);
        setLongField(term3985965, term3985965.getClass(), "id", -3386350485593225983L);
        setLongField(term3985967, term3985967.getClass(), "id", 6244141154902904036L);
        setField(term3985967, term3985967.getClass(), "extId", term3985969);
        setField(term3985967, term3985967.getClass(), "luid", "cUPEbZxnym");
        setIntField(term3985984, term3985984.getClass(), "year", 2022);
        setShortField(term3985984, term3985984.getClass(), "month", (short) 12);
        setShortField(term3985984, term3985984.getClass(), "day", (short) 6);
        setField(term3985983, term3985983.getClass(), "date", term3985984);
        setByteField(term3985988, term3985988.getClass(), "hour", (byte) 12);
        setByteField(term3985988, term3985988.getClass(), "minute", (byte) 48);
        setByteField(term3985988, term3985988.getClass(), "second", (byte) 0);
        setIntField(term3985988, term3985988.getClass(), "nano", 598491155);
        setField(term3985983, term3985983.getClass(), "time", term3985988);
        setField(term3985967, term3985967.getClass(), "registerTime", term3985983);
        setIntField(term3985994, term3985994.getClass(), "year", 2021);
        setShortField(term3985994, term3985994.getClass(), "month", (short) 10);
        setShortField(term3985994, term3985994.getClass(), "day", (short) 5);
        setField(term3985993, term3985993.getClass(), "date", term3985994);
        setByteField(term3985998, term3985998.getClass(), "hour", (byte) 19);
        setByteField(term3985998, term3985998.getClass(), "minute", (byte) 59);
        setByteField(term3985998, term3985998.getClass(), "second", (byte) 5);
        setIntField(term3985998, term3985998.getClass(), "nano", 45300318);
        setField(term3985993, term3985993.getClass(), "time", term3985998);
        setField(term3985967, term3985967.getClass(), "accessTime", term3985993);
        setField(term3985965, term3985965.getClass(), "card", term3985967);
        setIntField(term3985965, term3985965.getClass(), "lastDataVersion", -966350814);
        setField(term3985965, term3985965.getClass(), "userName", "uFdnkrTaVQ");
        setIntField(term3985965, term3985965.getClass(), "point", 393114412);
        setIntField(term3985965, term3985965.getClass(), "totalPoint", 864207397);
        setIntField(term3985965, term3985965.getClass(), "iconId", 604141764);
        setIntField(term3985965, term3985965.getClass(), "nameplateId", 1163274503);
        setIntField(term3985965, term3985965.getClass(), "frameId", -1776929649);
        setIntField(term3985965, term3985965.getClass(), "trophyId", 181293394);
        setIntField(term3985965, term3985965.getClass(), "playCount", 1028337719);
        setIntField(term3985965, term3985965.getClass(), "playVsCount", -383046303);
        setIntField(term3985965, term3985965.getClass(), "playSyncCount", 1383552434);
        setIntField(term3985965, term3985965.getClass(), "winCount", -1495541641);
        setIntField(term3985965, term3985965.getClass(), "helpCount", 1562952235);
        setIntField(term3985965, term3985965.getClass(), "comboCount", 117164468);
        setIntField(term3985965, term3985965.getClass(), "feverCount", -850395145);
        setIntField(term3985965, term3985965.getClass(), "totalHiScore", 1389781688);
        setIntField(term3985965, term3985965.getClass(), "totalEasyHighScore", 907117516);
        setIntField(term3985965, term3985965.getClass(), "totalBasicHighScore", 628786916);
        setIntField(term3985965, term3985965.getClass(), "totalAdvancedHighScore", 380783017);
        setIntField(term3985965, term3985965.getClass(), "totalExpertHighScore", -719813729);
        setIntField(term3985965, term3985965.getClass(), "totalMasterHighScore", -1354692602);
        setIntField(term3985965, term3985965.getClass(), "totalReMasterHighScore", 459587339);
        setIntField(term3985965, term3985965.getClass(), "totalHighSync", 1440232512);
        setIntField(term3985965, term3985965.getClass(), "totalEasySync", 428913163);
        setIntField(term3985965, term3985965.getClass(), "totalBasicSync", 203034987);
        setIntField(term3985965, term3985965.getClass(), "totalAdvancedSync", -1984334964);
        setIntField(term3985965, term3985965.getClass(), "totalExpertSync", -918369564);
        setIntField(term3985965, term3985965.getClass(), "totalMasterSync", -837034391);
        setIntField(term3985965, term3985965.getClass(), "totalReMasterSync", 1905999450);
        setIntField(term3985965, term3985965.getClass(), "playerRating", 1782509672);
        setIntField(term3985965, term3985965.getClass(), "highestRating", -271702737);
        setIntField(term3985965, term3985965.getClass(), "rankAuthTailId", 1597421602);
        setField(term3985965, term3985965.getClass(), "eventWatchedDate", "KYVpkMjyEN");
        setField(term3985965, term3985965.getClass(), "webLimitDate", "vYAVzPDHcT");
        setIntField(term3985965, term3985965.getClass(), "challengeTrackPhase", 1630524252);
        setIntField(term3985965, term3985965.getClass(), "firstPlayBits", 1013895376);
        setField(term3985965, term3985965.getClass(), "lastPlayDate", "kubqdjtcJg");
        setIntField(term3985965, term3985965.getClass(), "lastPlaceId", 1169969719);
        setField(term3985965, term3985965.getClass(), "lastPlaceName", "gIxQkBOrvl");
        setIntField(term3985965, term3985965.getClass(), "lastRegionId", 1685673556);
        setField(term3985965, term3985965.getClass(), "lastRegionName", "TkqFhSIMTO");
        setField(term3985965, term3985965.getClass(), "lastClientId", "AXbQvPHpfb");
        setField(term3985965, term3985965.getClass(), "lastCountryCode", "ahwRHLmilB");
        setIntField(term3985965, term3985965.getClass(), "eventPoint", -1596438575);
        setIntField(term3985965, term3985965.getClass(), "totalLv", 742734074);
        setIntField(term3985965, term3985965.getClass(), "lastLoginBonusDay", 542470091);
        setIntField(term3985965, term3985965.getClass(), "lastSurvivalBonusDay", 1666725827);
        setIntField(term3985965, term3985965.getClass(), "loginBonusLv", 440170699);
        setField(term3985963, term3985963.getClass(), "user", term3985965);
        setIntField(term3985963, term3985963.getClass(), "orderId", 149510456);
        setLongField(term3985963, term3985963.getClass(), "sortNumber", -2138774295038488129L);
        setIntField(term3985963, term3985963.getClass(), "placeId", 1205563899);
        setField(term3985963, term3985963.getClass(), "placeName", "IugWIWIbbq");
        setField(term3985963, term3985963.getClass(), "country", "jjArubNiBs");
        setIntField(term3985963, term3985963.getClass(), "regionId", -958345711);
        setField(term3985963, term3985963.getClass(), "playDate", "njQAMUntmu");
        setField(term3985963, term3985963.getClass(), "userPlayDate", "wqRKQICXIJ");
        setIntField(term3985963, term3985963.getClass(), "musicId", 653502009);
        setIntField(term3985963, term3985963.getClass(), "level", 32673349);
        setIntField(term3985963, term3985963.getClass(), "gameMode", 1316249309);
        setIntField(term3985963, term3985963.getClass(), "rivalNum", 1675036717);
        setIntField(term3985963, term3985963.getClass(), "track", -1771266489);
        setIntField(term3985963, term3985963.getClass(), "eventId", 2054075106);
        setBooleanField(term3985963, term3985963.getClass(), "isFreeToPlay", false);
        setIntField(term3985963, term3985963.getClass(), "playerRating", -1550450034);
        setLongField(term3985963, term3985963.getClass(), "playedUserId1", -1516963359703835787L);
        setField(term3985963, term3985963.getClass(), "playedUserName1", "YPgkVYDgjl");
        setIntField(term3985963, term3985963.getClass(), "playedMusicLevel1", -318992375);
        setLongField(term3985963, term3985963.getClass(), "playedUserId2", -1530137042686397381L);
        setField(term3985963, term3985963.getClass(), "playedUserName2", "hKANoOvdpK");
        setIntField(term3985963, term3985963.getClass(), "playedMusicLevel2", 732084997);
        setLongField(term3985963, term3985963.getClass(), "playedUserId3", 8791974612429704721L);
        setField(term3985963, term3985963.getClass(), "playedUserName3", "wVEXwVUbzW");
        setIntField(term3985963, term3985963.getClass(), "playedMusicLevel3", 906196641);
        setIntField(term3985963, term3985963.getClass(), "achievement", -1565892745);
        setIntField(term3985963, term3985963.getClass(), "score", 1654763407);
        setIntField(term3985963, term3985963.getClass(), "tapScore", -193817018);
        setIntField(term3985963, term3985963.getClass(), "holdScore", 802016767);
        setIntField(term3985963, term3985963.getClass(), "slideScore", 2035572433);
        setIntField(term3985963, term3985963.getClass(), "breakScore", 103485653);
        setIntField(term3985963, term3985963.getClass(), "syncRate", 1814796234);
        setIntField(term3985963, term3985963.getClass(), "vsWin", 1497354168);
        setBooleanField(term3985963, term3985963.getClass(), "isAllPerfect", false);
        setIntField(term3985963, term3985963.getClass(), "fullCombo", -1573878422);
        setIntField(term3985963, term3985963.getClass(), "maxFever", 1563872654);
        setIntField(term3985963, term3985963.getClass(), "maxCombo", -181812833);
        setIntField(term3985963, term3985963.getClass(), "tapPerfect", -1301376169);
        setIntField(term3985963, term3985963.getClass(), "tapGreat", -1134186328);
        setIntField(term3985963, term3985963.getClass(), "tapGood", -1145142845);
        setIntField(term3985963, term3985963.getClass(), "tapBad", -1676321085);
        setIntField(term3985963, term3985963.getClass(), "holdPerfect", -632888052);
        setIntField(term3985963, term3985963.getClass(), "holdGreat", -350871602);
        setIntField(term3985963, term3985963.getClass(), "holdGood", -130329149);
        setIntField(term3985963, term3985963.getClass(), "holdBad", -249792498);
        setIntField(term3985963, term3985963.getClass(), "slidePerfect", -1522998591);
        setIntField(term3985963, term3985963.getClass(), "slideGreat", 1375817086);
        setIntField(term3985963, term3985963.getClass(), "slideGood", -475253928);
        setIntField(term3985963, term3985963.getClass(), "slideBad", -632016050);
        setIntField(term3985963, term3985963.getClass(), "breakPerfect", 425186926);
        setIntField(term3985963, term3985963.getClass(), "breakGreat", 715873662);
        setIntField(term3985963, term3985963.getClass(), "breakGood", -525493701);
        setIntField(term3985963, term3985963.getClass(), "breakBad", -995196749);
        setBooleanField(term3985963, term3985963.getClass(), "isTrackSkip", true);
        setBooleanField(term3985963, term3985963.getClass(), "isHighScore", false);
        setBooleanField(term3985963, term3985963.getClass(), "isChallengeTrack", true);
        setIntField(term3985963, term3985963.getClass(), "challengeLife", -1863523924);
        setIntField(term3985963, term3985963.getClass(), "challengeRemain", -949542210);
        setIntField(term3985963, term3985963.getClass(), "isAllPerfectPlus", 869648329);
        term3986275 = new Integer(1490205293);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term3986275;
        callMethod(klass, "setMaxCombo", argTypes, term3985963, args);
    }

};


