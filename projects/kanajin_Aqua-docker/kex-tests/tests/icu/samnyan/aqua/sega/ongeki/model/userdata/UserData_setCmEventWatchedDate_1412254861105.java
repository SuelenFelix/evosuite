package icu.samnyan.aqua.sega.ongeki.model.userdata;

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
import static icu.samnyan.aqua.sega.ongeki.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class UserData_setCmEventWatchedDate_1412254861105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66503;

    public UserData_setCmEventWatchedDate_1412254861105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term66507 = new Long(-7884871963229073324L);
        term66503 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term66505 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term66521 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term66522 = newInstance(Class.forName("java.time.LocalDate"));
        Object term66526 = newInstance(Class.forName("java.time.LocalTime"));
        Object term66531 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term66532 = newInstance(Class.forName("java.time.LocalDate"));
        Object term66536 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term66503, term66503.getClass(), "id", -8090024033686339139L);
        setLongField(term66505, term66505.getClass(), "id", 2068874593380068539L);
        setField(term66505, term66505.getClass(), "extId", term66507);
        setField(term66505, term66505.getClass(), "luid", "opEyNuSzgs");
        setIntField(term66522, term66522.getClass(), "year", 2014);
        setShortField(term66522, term66522.getClass(), "month", (short) 5);
        setShortField(term66522, term66522.getClass(), "day", (short) 18);
        setField(term66521, term66521.getClass(), "date", term66522);
        setByteField(term66526, term66526.getClass(), "hour", (byte) 19);
        setByteField(term66526, term66526.getClass(), "minute", (byte) 25);
        setByteField(term66526, term66526.getClass(), "second", (byte) 8);
        setIntField(term66526, term66526.getClass(), "nano", 217186771);
        setField(term66521, term66521.getClass(), "time", term66526);
        setField(term66505, term66505.getClass(), "registerTime", term66521);
        setIntField(term66532, term66532.getClass(), "year", 2023);
        setShortField(term66532, term66532.getClass(), "month", (short) 2);
        setShortField(term66532, term66532.getClass(), "day", (short) 27);
        setField(term66531, term66531.getClass(), "date", term66532);
        setByteField(term66536, term66536.getClass(), "hour", (byte) 5);
        setByteField(term66536, term66536.getClass(), "minute", (byte) 50);
        setByteField(term66536, term66536.getClass(), "second", (byte) 50);
        setIntField(term66536, term66536.getClass(), "nano", 528521692);
        setField(term66531, term66531.getClass(), "time", term66536);
        setField(term66505, term66505.getClass(), "accessTime", term66531);
        setField(term66503, term66503.getClass(), "card", term66505);
        setField(term66503, term66503.getClass(), "userName", "YTnlgdIqfA");
        setIntField(term66503, term66503.getClass(), "level", 1989206053);
        setIntField(term66503, term66503.getClass(), "reincarnationNum", 68383055);
        setLongField(term66503, term66503.getClass(), "exp", -7302550625879930077L);
        setLongField(term66503, term66503.getClass(), "point", 547751867620565142L);
        setLongField(term66503, term66503.getClass(), "totalPoint", 7129464628272755377L);
        setIntField(term66503, term66503.getClass(), "playCount", -2072291494);
        setIntField(term66503, term66503.getClass(), "jewelCount", 1818270937);
        setIntField(term66503, term66503.getClass(), "totalJewelCount", -1309831162);
        setIntField(term66503, term66503.getClass(), "medalCount", 711539163);
        setIntField(term66503, term66503.getClass(), "playerRating", 351652776);
        setIntField(term66503, term66503.getClass(), "highestRating", 319658723);
        setIntField(term66503, term66503.getClass(), "battlePoint", 1315068409);
        setIntField(term66503, term66503.getClass(), "bestBattlePoint", 1002887761);
        setIntField(term66503, term66503.getClass(), "overDamageBattlePoint", 38995637);
        setBooleanField(term66503, term66503.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term66503, term66503.getClass(), "nameplateId", -2106212589);
        setIntField(term66503, term66503.getClass(), "trophyId", 1881486751);
        setIntField(term66503, term66503.getClass(), "cardId", -92679624);
        setIntField(term66503, term66503.getClass(), "characterId", 935287448);
        setIntField(term66503, term66503.getClass(), "characterVoiceNo", -315809486);
        setIntField(term66503, term66503.getClass(), "tabSetting", -1846398473);
        setIntField(term66503, term66503.getClass(), "tabSortSetting", -11976264);
        setIntField(term66503, term66503.getClass(), "cardCategorySetting", 1655201167);
        setIntField(term66503, term66503.getClass(), "cardSortSetting", -613873747);
        setIntField(term66503, term66503.getClass(), "rivalScoreCategorySetting", 1141630209);
        setIntField(term66503, term66503.getClass(), "playedTutorialBit", -1809659280);
        setIntField(term66503, term66503.getClass(), "firstTutorialCancelNum", 2076646471);
        setLongField(term66503, term66503.getClass(), "sumTechHighScore", -1473630530222186168L);
        setLongField(term66503, term66503.getClass(), "sumTechBasicHighScore", -491562959649300308L);
        setLongField(term66503, term66503.getClass(), "sumTechAdvancedHighScore", -348524442664216841L);
        setLongField(term66503, term66503.getClass(), "sumTechExpertHighScore", 7543403646493723501L);
        setLongField(term66503, term66503.getClass(), "sumTechMasterHighScore", -6800678833488490645L);
        setLongField(term66503, term66503.getClass(), "sumTechLunaticHighScore", -4582297078014649720L);
        setLongField(term66503, term66503.getClass(), "sumBattleHighScore", 4071050160240086990L);
        setLongField(term66503, term66503.getClass(), "sumBattleBasicHighScore", 6279284197715302448L);
        setLongField(term66503, term66503.getClass(), "sumBattleAdvancedHighScore", 525588459638783666L);
        setLongField(term66503, term66503.getClass(), "sumBattleExpertHighScore", -2297183576781433639L);
        setLongField(term66503, term66503.getClass(), "sumBattleMasterHighScore", 8032688624254626392L);
        setLongField(term66503, term66503.getClass(), "sumBattleLunaticHighScore", -6760944154924277473L);
        setField(term66503, term66503.getClass(), "eventWatchedDate", "gcKmFclftu");
        setField(term66503, term66503.getClass(), "cmEventWatchedDate", "lfREOBPEuD");
        setField(term66503, term66503.getClass(), "firstGameId", "JAGjDlTwTa");
        setField(term66503, term66503.getClass(), "firstRomVersion", "wIDeyLnekQ");
        setField(term66503, term66503.getClass(), "firstDataVersion", "tOGPTIqSMm");
        setField(term66503, term66503.getClass(), "firstPlayDate", "cFwZnaLmLP");
        setField(term66503, term66503.getClass(), "lastGameId", "cBtfnWBMkE");
        setField(term66503, term66503.getClass(), "lastRomVersion", "sFixkFlMhw");
        setField(term66503, term66503.getClass(), "lastDataVersion", "wNaCYPwDGZ");
        setField(term66503, term66503.getClass(), "compatibleCmVersion", "CFojehEtAR");
        setField(term66503, term66503.getClass(), "lastPlayDate", "EYeLeoxDrM");
        setIntField(term66503, term66503.getClass(), "lastPlaceId", -63936889);
        setField(term66503, term66503.getClass(), "lastPlaceName", "zIPJJJubgX");
        setIntField(term66503, term66503.getClass(), "lastRegionId", 1893773732);
        setField(term66503, term66503.getClass(), "lastRegionName", "WRbxmSFTaO");
        setIntField(term66503, term66503.getClass(), "lastAllNetId", -1854658170);
        setField(term66503, term66503.getClass(), "lastClientId", "ZekQCuvPXT");
        setIntField(term66503, term66503.getClass(), "lastUsedDeckId", -383472550);
        setIntField(term66503, term66503.getClass(), "lastPlayMusicLevel", 1184946577);
        setIntField(term66503, term66503.getClass(), "lastEmoneyBrand", 1076103120);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "GUXdlpmVNQ";
        callMethod(klass, "setCmEventWatchedDate", argTypes, term66503, args);
    }

};


