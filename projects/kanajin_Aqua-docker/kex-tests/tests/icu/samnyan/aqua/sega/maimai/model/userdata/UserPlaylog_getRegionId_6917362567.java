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

public class UserPlaylog_getRegionId_6917362567 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term115695;

    public UserPlaylog_getRegionId_6917362567() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term115701 = new Long(-7983954942068142191L);
        term115695 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term115697 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term115699 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term115715 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term115716 = newInstance(Class.forName("java.time.LocalDate"));
        Object term115720 = newInstance(Class.forName("java.time.LocalTime"));
        Object term115725 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term115726 = newInstance(Class.forName("java.time.LocalDate"));
        Object term115730 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term115695, term115695.getClass(), "id", 4418899868035922058L);
        setLongField(term115697, term115697.getClass(), "id", 4663932691158406829L);
        setLongField(term115699, term115699.getClass(), "id", -5802364286448544947L);
        setField(term115699, term115699.getClass(), "extId", term115701);
        setField(term115699, term115699.getClass(), "luid", "RDXQLsyKOu");
        setIntField(term115716, term115716.getClass(), "year", 2012);
        setShortField(term115716, term115716.getClass(), "month", (short) 8);
        setShortField(term115716, term115716.getClass(), "day", (short) 31);
        setField(term115715, term115715.getClass(), "date", term115716);
        setByteField(term115720, term115720.getClass(), "hour", (byte) 17);
        setByteField(term115720, term115720.getClass(), "minute", (byte) 11);
        setByteField(term115720, term115720.getClass(), "second", (byte) 29);
        setIntField(term115720, term115720.getClass(), "nano", 462334388);
        setField(term115715, term115715.getClass(), "time", term115720);
        setField(term115699, term115699.getClass(), "registerTime", term115715);
        setIntField(term115726, term115726.getClass(), "year", 2027);
        setShortField(term115726, term115726.getClass(), "month", (short) 11);
        setShortField(term115726, term115726.getClass(), "day", (short) 28);
        setField(term115725, term115725.getClass(), "date", term115726);
        setByteField(term115730, term115730.getClass(), "hour", (byte) 23);
        setByteField(term115730, term115730.getClass(), "minute", (byte) 7);
        setByteField(term115730, term115730.getClass(), "second", (byte) 56);
        setIntField(term115730, term115730.getClass(), "nano", 948648524);
        setField(term115725, term115725.getClass(), "time", term115730);
        setField(term115699, term115699.getClass(), "accessTime", term115725);
        setField(term115697, term115697.getClass(), "card", term115699);
        setIntField(term115697, term115697.getClass(), "lastDataVersion", 80001823);
        setField(term115697, term115697.getClass(), "userName", "ZnIRhQxVXw");
        setIntField(term115697, term115697.getClass(), "point", -132224670);
        setIntField(term115697, term115697.getClass(), "totalPoint", -2084438499);
        setIntField(term115697, term115697.getClass(), "iconId", -2108733549);
        setIntField(term115697, term115697.getClass(), "nameplateId", -1646304288);
        setIntField(term115697, term115697.getClass(), "frameId", -1367231703);
        setIntField(term115697, term115697.getClass(), "trophyId", -1877202574);
        setIntField(term115697, term115697.getClass(), "playCount", -1675786952);
        setIntField(term115697, term115697.getClass(), "playVsCount", -1707598452);
        setIntField(term115697, term115697.getClass(), "playSyncCount", -1313984720);
        setIntField(term115697, term115697.getClass(), "winCount", 2138390161);
        setIntField(term115697, term115697.getClass(), "helpCount", -1087119999);
        setIntField(term115697, term115697.getClass(), "comboCount", -202818613);
        setIntField(term115697, term115697.getClass(), "feverCount", -36650275);
        setIntField(term115697, term115697.getClass(), "totalHiScore", -1676429754);
        setIntField(term115697, term115697.getClass(), "totalEasyHighScore", 1488573561);
        setIntField(term115697, term115697.getClass(), "totalBasicHighScore", 1837348875);
        setIntField(term115697, term115697.getClass(), "totalAdvancedHighScore", 85617865);
        setIntField(term115697, term115697.getClass(), "totalExpertHighScore", -918971256);
        setIntField(term115697, term115697.getClass(), "totalMasterHighScore", 1266243966);
        setIntField(term115697, term115697.getClass(), "totalReMasterHighScore", -1440767137);
        setIntField(term115697, term115697.getClass(), "totalHighSync", 1799592662);
        setIntField(term115697, term115697.getClass(), "totalEasySync", 198586110);
        setIntField(term115697, term115697.getClass(), "totalBasicSync", 1369038204);
        setIntField(term115697, term115697.getClass(), "totalAdvancedSync", 1877430948);
        setIntField(term115697, term115697.getClass(), "totalExpertSync", 1302744454);
        setIntField(term115697, term115697.getClass(), "totalMasterSync", 584343492);
        setIntField(term115697, term115697.getClass(), "totalReMasterSync", -465954723);
        setIntField(term115697, term115697.getClass(), "playerRating", 182888677);
        setIntField(term115697, term115697.getClass(), "highestRating", -561603446);
        setIntField(term115697, term115697.getClass(), "rankAuthTailId", 1552433262);
        setField(term115697, term115697.getClass(), "eventWatchedDate", "AVAyxUcLrK");
        setField(term115697, term115697.getClass(), "webLimitDate", "xLwgTuAlud");
        setIntField(term115697, term115697.getClass(), "challengeTrackPhase", -1998835264);
        setIntField(term115697, term115697.getClass(), "firstPlayBits", 244982784);
        setField(term115697, term115697.getClass(), "lastPlayDate", "rwsyozeRfD");
        setIntField(term115697, term115697.getClass(), "lastPlaceId", 864448665);
        setField(term115697, term115697.getClass(), "lastPlaceName", "FYBnWmfXch");
        setIntField(term115697, term115697.getClass(), "lastRegionId", -1638295220);
        setField(term115697, term115697.getClass(), "lastRegionName", "ZCKJKntKil");
        setField(term115697, term115697.getClass(), "lastClientId", "fyrqWlhCEt");
        setField(term115697, term115697.getClass(), "lastCountryCode", "tFABhePKqp");
        setIntField(term115697, term115697.getClass(), "eventPoint", -1012973336);
        setIntField(term115697, term115697.getClass(), "totalLv", -1370517623);
        setIntField(term115697, term115697.getClass(), "lastLoginBonusDay", 1773831811);
        setIntField(term115697, term115697.getClass(), "lastSurvivalBonusDay", -789958417);
        setIntField(term115697, term115697.getClass(), "loginBonusLv", -310618122);
        setField(term115695, term115695.getClass(), "user", term115697);
        setIntField(term115695, term115695.getClass(), "orderId", 958693869);
        setLongField(term115695, term115695.getClass(), "sortNumber", 7633060281229939158L);
        setIntField(term115695, term115695.getClass(), "placeId", -1432088699);
        setField(term115695, term115695.getClass(), "placeName", "FtjQbVqqqx");
        setField(term115695, term115695.getClass(), "country", "FMhmrgLOkN");
        setIntField(term115695, term115695.getClass(), "regionId", -371554324);
        setField(term115695, term115695.getClass(), "playDate", "UqPFsSwrTW");
        setField(term115695, term115695.getClass(), "userPlayDate", "zwAKIxjbAz");
        setIntField(term115695, term115695.getClass(), "musicId", 778866266);
        setIntField(term115695, term115695.getClass(), "level", 76351450);
        setIntField(term115695, term115695.getClass(), "gameMode", -1112309026);
        setIntField(term115695, term115695.getClass(), "rivalNum", -180876065);
        setIntField(term115695, term115695.getClass(), "track", -272580985);
        setIntField(term115695, term115695.getClass(), "eventId", -368107042);
        setBooleanField(term115695, term115695.getClass(), "isFreeToPlay", false);
        setIntField(term115695, term115695.getClass(), "playerRating", 254702754);
        setLongField(term115695, term115695.getClass(), "playedUserId1", 4171742078739516731L);
        setField(term115695, term115695.getClass(), "playedUserName1", "RlMsoYxesz");
        setIntField(term115695, term115695.getClass(), "playedMusicLevel1", 1741425842);
        setLongField(term115695, term115695.getClass(), "playedUserId2", 4391974157316283404L);
        setField(term115695, term115695.getClass(), "playedUserName2", "FkuWKCInZG");
        setIntField(term115695, term115695.getClass(), "playedMusicLevel2", 1246423782);
        setLongField(term115695, term115695.getClass(), "playedUserId3", -8447404910321380142L);
        setField(term115695, term115695.getClass(), "playedUserName3", "WoRWEXpkMK");
        setIntField(term115695, term115695.getClass(), "playedMusicLevel3", 142997582);
        setIntField(term115695, term115695.getClass(), "achievement", -392460851);
        setIntField(term115695, term115695.getClass(), "score", -919411937);
        setIntField(term115695, term115695.getClass(), "tapScore", 2038726156);
        setIntField(term115695, term115695.getClass(), "holdScore", 1896474985);
        setIntField(term115695, term115695.getClass(), "slideScore", -847986277);
        setIntField(term115695, term115695.getClass(), "breakScore", 1293365107);
        setIntField(term115695, term115695.getClass(), "syncRate", -405022162);
        setIntField(term115695, term115695.getClass(), "vsWin", -372714052);
        setBooleanField(term115695, term115695.getClass(), "isAllPerfect", false);
        setIntField(term115695, term115695.getClass(), "fullCombo", -367920107);
        setIntField(term115695, term115695.getClass(), "maxFever", 644157843);
        setIntField(term115695, term115695.getClass(), "maxCombo", 1543957460);
        setIntField(term115695, term115695.getClass(), "tapPerfect", -1075032377);
        setIntField(term115695, term115695.getClass(), "tapGreat", 2009204207);
        setIntField(term115695, term115695.getClass(), "tapGood", 1778758468);
        setIntField(term115695, term115695.getClass(), "tapBad", -2099268660);
        setIntField(term115695, term115695.getClass(), "holdPerfect", 1667337184);
        setIntField(term115695, term115695.getClass(), "holdGreat", 824363409);
        setIntField(term115695, term115695.getClass(), "holdGood", -386686554);
        setIntField(term115695, term115695.getClass(), "holdBad", 271252577);
        setIntField(term115695, term115695.getClass(), "slidePerfect", 103893335);
        setIntField(term115695, term115695.getClass(), "slideGreat", 171287923);
        setIntField(term115695, term115695.getClass(), "slideGood", -142820607);
        setIntField(term115695, term115695.getClass(), "slideBad", -101143092);
        setIntField(term115695, term115695.getClass(), "breakPerfect", -481036838);
        setIntField(term115695, term115695.getClass(), "breakGreat", -1985046611);
        setIntField(term115695, term115695.getClass(), "breakGood", 428782787);
        setIntField(term115695, term115695.getClass(), "breakBad", -1722780181);
        setBooleanField(term115695, term115695.getClass(), "isTrackSkip", true);
        setBooleanField(term115695, term115695.getClass(), "isHighScore", false);
        setBooleanField(term115695, term115695.getClass(), "isChallengeTrack", false);
        setIntField(term115695, term115695.getClass(), "challengeLife", -120532453);
        setIntField(term115695, term115695.getClass(), "challengeRemain", 1641156302);
        setIntField(term115695, term115695.getClass(), "isAllPerfectPlus", -1103659575);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRegionId", argTypes, term115695, args);
    }

};


