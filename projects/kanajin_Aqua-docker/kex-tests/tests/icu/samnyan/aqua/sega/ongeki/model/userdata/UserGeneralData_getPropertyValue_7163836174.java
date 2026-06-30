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

public class UserGeneralData_getPropertyValue_7163836174 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term295620;

    public UserGeneralData_getPropertyValue_7163836174() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term295626 = new Long(7875739215674729968L);
        term295620 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserGeneralData"));
        Object term295622 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term295624 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term295640 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term295641 = newInstance(Class.forName("java.time.LocalDate"));
        Object term295645 = newInstance(Class.forName("java.time.LocalTime"));
        Object term295650 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term295651 = newInstance(Class.forName("java.time.LocalDate"));
        Object term295655 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term295620, term295620.getClass(), "id", 5197687369707267258L);
        setLongField(term295622, term295622.getClass(), "id", 6103473893446805472L);
        setLongField(term295624, term295624.getClass(), "id", 1304369164485419716L);
        setField(term295624, term295624.getClass(), "extId", term295626);
        setField(term295624, term295624.getClass(), "luid", "BsVYnEehhF");
        setIntField(term295641, term295641.getClass(), "year", 2029);
        setShortField(term295641, term295641.getClass(), "month", (short) 12);
        setShortField(term295641, term295641.getClass(), "day", (short) 12);
        setField(term295640, term295640.getClass(), "date", term295641);
        setByteField(term295645, term295645.getClass(), "hour", (byte) 15);
        setByteField(term295645, term295645.getClass(), "minute", (byte) 3);
        setByteField(term295645, term295645.getClass(), "second", (byte) 43);
        setIntField(term295645, term295645.getClass(), "nano", 857071372);
        setField(term295640, term295640.getClass(), "time", term295645);
        setField(term295624, term295624.getClass(), "registerTime", term295640);
        setIntField(term295651, term295651.getClass(), "year", 2021);
        setShortField(term295651, term295651.getClass(), "month", (short) 7);
        setShortField(term295651, term295651.getClass(), "day", (short) 29);
        setField(term295650, term295650.getClass(), "date", term295651);
        setByteField(term295655, term295655.getClass(), "hour", (byte) 15);
        setByteField(term295655, term295655.getClass(), "minute", (byte) 49);
        setByteField(term295655, term295655.getClass(), "second", (byte) 59);
        setIntField(term295655, term295655.getClass(), "nano", 985113536);
        setField(term295650, term295650.getClass(), "time", term295655);
        setField(term295624, term295624.getClass(), "accessTime", term295650);
        setField(term295622, term295622.getClass(), "card", term295624);
        setField(term295622, term295622.getClass(), "userName", "YwJlByssSF");
        setIntField(term295622, term295622.getClass(), "level", -1190556666);
        setIntField(term295622, term295622.getClass(), "reincarnationNum", -1290143872);
        setLongField(term295622, term295622.getClass(), "exp", 3071932332096684049L);
        setLongField(term295622, term295622.getClass(), "point", -5653105802965641342L);
        setLongField(term295622, term295622.getClass(), "totalPoint", 4528531989613176565L);
        setIntField(term295622, term295622.getClass(), "playCount", -1982052794);
        setIntField(term295622, term295622.getClass(), "jewelCount", -422015239);
        setIntField(term295622, term295622.getClass(), "totalJewelCount", -778823717);
        setIntField(term295622, term295622.getClass(), "medalCount", 1338581400);
        setIntField(term295622, term295622.getClass(), "playerRating", -2035948478);
        setIntField(term295622, term295622.getClass(), "highestRating", 667456779);
        setIntField(term295622, term295622.getClass(), "battlePoint", 1985662415);
        setIntField(term295622, term295622.getClass(), "bestBattlePoint", 2060719232);
        setIntField(term295622, term295622.getClass(), "overDamageBattlePoint", 106926990);
        setBooleanField(term295622, term295622.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term295622, term295622.getClass(), "nameplateId", 803199278);
        setIntField(term295622, term295622.getClass(), "trophyId", -589755209);
        setIntField(term295622, term295622.getClass(), "cardId", -651125720);
        setIntField(term295622, term295622.getClass(), "characterId", -1348920499);
        setIntField(term295622, term295622.getClass(), "characterVoiceNo", -1211511267);
        setIntField(term295622, term295622.getClass(), "tabSetting", -1968411696);
        setIntField(term295622, term295622.getClass(), "tabSortSetting", 419141804);
        setIntField(term295622, term295622.getClass(), "cardCategorySetting", -4764095);
        setIntField(term295622, term295622.getClass(), "cardSortSetting", -1967454603);
        setIntField(term295622, term295622.getClass(), "rivalScoreCategorySetting", 362837180);
        setIntField(term295622, term295622.getClass(), "playedTutorialBit", 860277262);
        setIntField(term295622, term295622.getClass(), "firstTutorialCancelNum", 377978480);
        setLongField(term295622, term295622.getClass(), "sumTechHighScore", 7971663859938323174L);
        setLongField(term295622, term295622.getClass(), "sumTechBasicHighScore", 7058736918155260664L);
        setLongField(term295622, term295622.getClass(), "sumTechAdvancedHighScore", 3823403787217666942L);
        setLongField(term295622, term295622.getClass(), "sumTechExpertHighScore", -2687833389744815332L);
        setLongField(term295622, term295622.getClass(), "sumTechMasterHighScore", 6771508598815222777L);
        setLongField(term295622, term295622.getClass(), "sumTechLunaticHighScore", 5668704369909221916L);
        setLongField(term295622, term295622.getClass(), "sumBattleHighScore", -2946289158175011607L);
        setLongField(term295622, term295622.getClass(), "sumBattleBasicHighScore", 3636277212883068884L);
        setLongField(term295622, term295622.getClass(), "sumBattleAdvancedHighScore", -1255234807360520502L);
        setLongField(term295622, term295622.getClass(), "sumBattleExpertHighScore", -4473373447245089569L);
        setLongField(term295622, term295622.getClass(), "sumBattleMasterHighScore", -6127674890299721662L);
        setLongField(term295622, term295622.getClass(), "sumBattleLunaticHighScore", 3678376547979453570L);
        setField(term295622, term295622.getClass(), "eventWatchedDate", "EWbLFcROZq");
        setField(term295622, term295622.getClass(), "cmEventWatchedDate", "uZkkVJREva");
        setField(term295622, term295622.getClass(), "firstGameId", "lYGZmmgWDd");
        setField(term295622, term295622.getClass(), "firstRomVersion", "YzjQFbbtMR");
        setField(term295622, term295622.getClass(), "firstDataVersion", "iyFhYDVxSB");
        setField(term295622, term295622.getClass(), "firstPlayDate", "wqmAianxQK");
        setField(term295622, term295622.getClass(), "lastGameId", "FbERbbZMNs");
        setField(term295622, term295622.getClass(), "lastRomVersion", "qKghCzRGvs");
        setField(term295622, term295622.getClass(), "lastDataVersion", "zpshVYDLcR");
        setField(term295622, term295622.getClass(), "compatibleCmVersion", "jbBXnlcBeK");
        setField(term295622, term295622.getClass(), "lastPlayDate", "uascBPqTuU");
        setIntField(term295622, term295622.getClass(), "lastPlaceId", -2125543033);
        setField(term295622, term295622.getClass(), "lastPlaceName", "dFOpjLmNnE");
        setIntField(term295622, term295622.getClass(), "lastRegionId", 321747402);
        setField(term295622, term295622.getClass(), "lastRegionName", "CCgshdCJTR");
        setIntField(term295622, term295622.getClass(), "lastAllNetId", -666164444);
        setField(term295622, term295622.getClass(), "lastClientId", "tObTOEkwsm");
        setIntField(term295622, term295622.getClass(), "lastUsedDeckId", 254019332);
        setIntField(term295622, term295622.getClass(), "lastPlayMusicLevel", -2065129105);
        setIntField(term295622, term295622.getClass(), "lastEmoneyBrand", -2129130374);
        setField(term295620, term295620.getClass(), "user", term295622);
        setField(term295620, term295620.getClass(), "propertyKey", "UKoBRBiZED");
        setField(term295620, term295620.getClass(), "propertyValue", "QYLIYhaAna");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserGeneralData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPropertyValue", argTypes, term295620, args);
    }

};


