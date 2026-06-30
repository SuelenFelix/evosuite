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
import java.lang.Integer;

public class UserData_setCardId_62218299382 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56708;
     Object term56971;

    public UserData_setCardId_62218299382() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term56712 = new Long(7489064039921396098L);
        term56708 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term56710 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term56726 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term56727 = newInstance(Class.forName("java.time.LocalDate"));
        Object term56731 = newInstance(Class.forName("java.time.LocalTime"));
        Object term56736 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term56737 = newInstance(Class.forName("java.time.LocalDate"));
        Object term56741 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term56708, term56708.getClass(), "id", -51437660553060977L);
        setLongField(term56710, term56710.getClass(), "id", -2636567666096347903L);
        setField(term56710, term56710.getClass(), "extId", term56712);
        setField(term56710, term56710.getClass(), "luid", "jxuVQHHLqy");
        setIntField(term56727, term56727.getClass(), "year", 2029);
        setShortField(term56727, term56727.getClass(), "month", (short) 1);
        setShortField(term56727, term56727.getClass(), "day", (short) 21);
        setField(term56726, term56726.getClass(), "date", term56727);
        setByteField(term56731, term56731.getClass(), "hour", (byte) 9);
        setByteField(term56731, term56731.getClass(), "minute", (byte) 46);
        setByteField(term56731, term56731.getClass(), "second", (byte) 1);
        setIntField(term56731, term56731.getClass(), "nano", 276350652);
        setField(term56726, term56726.getClass(), "time", term56731);
        setField(term56710, term56710.getClass(), "registerTime", term56726);
        setIntField(term56737, term56737.getClass(), "year", 2019);
        setShortField(term56737, term56737.getClass(), "month", (short) 12);
        setShortField(term56737, term56737.getClass(), "day", (short) 20);
        setField(term56736, term56736.getClass(), "date", term56737);
        setByteField(term56741, term56741.getClass(), "hour", (byte) 22);
        setByteField(term56741, term56741.getClass(), "minute", (byte) 20);
        setByteField(term56741, term56741.getClass(), "second", (byte) 29);
        setIntField(term56741, term56741.getClass(), "nano", 582302461);
        setField(term56736, term56736.getClass(), "time", term56741);
        setField(term56710, term56710.getClass(), "accessTime", term56736);
        setField(term56708, term56708.getClass(), "card", term56710);
        setField(term56708, term56708.getClass(), "userName", "TnUXNtKOns");
        setIntField(term56708, term56708.getClass(), "level", 1555746325);
        setIntField(term56708, term56708.getClass(), "reincarnationNum", -1910031809);
        setLongField(term56708, term56708.getClass(), "exp", -7772427422426260409L);
        setLongField(term56708, term56708.getClass(), "point", -274606845369208412L);
        setLongField(term56708, term56708.getClass(), "totalPoint", -7965696185792680870L);
        setIntField(term56708, term56708.getClass(), "playCount", 1270786654);
        setIntField(term56708, term56708.getClass(), "jewelCount", -1971037654);
        setIntField(term56708, term56708.getClass(), "totalJewelCount", -1001929512);
        setIntField(term56708, term56708.getClass(), "medalCount", 1783875922);
        setIntField(term56708, term56708.getClass(), "playerRating", -1504060723);
        setIntField(term56708, term56708.getClass(), "highestRating", 1458290326);
        setIntField(term56708, term56708.getClass(), "battlePoint", 1025606001);
        setIntField(term56708, term56708.getClass(), "bestBattlePoint", -1227561158);
        setIntField(term56708, term56708.getClass(), "overDamageBattlePoint", -1853440273);
        setBooleanField(term56708, term56708.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term56708, term56708.getClass(), "nameplateId", 1884281846);
        setIntField(term56708, term56708.getClass(), "trophyId", -1779176468);
        setIntField(term56708, term56708.getClass(), "cardId", -790563662);
        setIntField(term56708, term56708.getClass(), "characterId", 692290973);
        setIntField(term56708, term56708.getClass(), "characterVoiceNo", 344667712);
        setIntField(term56708, term56708.getClass(), "tabSetting", 921447346);
        setIntField(term56708, term56708.getClass(), "tabSortSetting", 1514227664);
        setIntField(term56708, term56708.getClass(), "cardCategorySetting", 2000874140);
        setIntField(term56708, term56708.getClass(), "cardSortSetting", -701728269);
        setIntField(term56708, term56708.getClass(), "rivalScoreCategorySetting", -1094813190);
        setIntField(term56708, term56708.getClass(), "playedTutorialBit", -355401879);
        setIntField(term56708, term56708.getClass(), "firstTutorialCancelNum", -1878519758);
        setLongField(term56708, term56708.getClass(), "sumTechHighScore", 5089306796798248912L);
        setLongField(term56708, term56708.getClass(), "sumTechBasicHighScore", 1782263264310649624L);
        setLongField(term56708, term56708.getClass(), "sumTechAdvancedHighScore", -771085471756778777L);
        setLongField(term56708, term56708.getClass(), "sumTechExpertHighScore", 8407224691886601353L);
        setLongField(term56708, term56708.getClass(), "sumTechMasterHighScore", 2092148935299566168L);
        setLongField(term56708, term56708.getClass(), "sumTechLunaticHighScore", 6405038085604769458L);
        setLongField(term56708, term56708.getClass(), "sumBattleHighScore", 3588287041971902605L);
        setLongField(term56708, term56708.getClass(), "sumBattleBasicHighScore", 1868058982770066711L);
        setLongField(term56708, term56708.getClass(), "sumBattleAdvancedHighScore", -2110401611920536569L);
        setLongField(term56708, term56708.getClass(), "sumBattleExpertHighScore", 9177575941340536961L);
        setLongField(term56708, term56708.getClass(), "sumBattleMasterHighScore", -1059614177994496314L);
        setLongField(term56708, term56708.getClass(), "sumBattleLunaticHighScore", 6226372791837550337L);
        setField(term56708, term56708.getClass(), "eventWatchedDate", "umsYdaPflb");
        setField(term56708, term56708.getClass(), "cmEventWatchedDate", "CnNmpSyiBE");
        setField(term56708, term56708.getClass(), "firstGameId", "JvKKIGdUWh");
        setField(term56708, term56708.getClass(), "firstRomVersion", "DInvDrzBtt");
        setField(term56708, term56708.getClass(), "firstDataVersion", "igZJubDPuK");
        setField(term56708, term56708.getClass(), "firstPlayDate", "qxBdFhLbAN");
        setField(term56708, term56708.getClass(), "lastGameId", "KyUmXHRrED");
        setField(term56708, term56708.getClass(), "lastRomVersion", "eOMBFVrNcf");
        setField(term56708, term56708.getClass(), "lastDataVersion", "gOwOIsocMB");
        setField(term56708, term56708.getClass(), "compatibleCmVersion", "GqTBOhQBgV");
        setField(term56708, term56708.getClass(), "lastPlayDate", "DQhxOWqEyi");
        setIntField(term56708, term56708.getClass(), "lastPlaceId", -214099950);
        setField(term56708, term56708.getClass(), "lastPlaceName", "dSszYGDwAk");
        setIntField(term56708, term56708.getClass(), "lastRegionId", -1324210306);
        setField(term56708, term56708.getClass(), "lastRegionName", "gNeMyGSVIG");
        setIntField(term56708, term56708.getClass(), "lastAllNetId", -1148507981);
        setField(term56708, term56708.getClass(), "lastClientId", "qxEkaqdKPG");
        setIntField(term56708, term56708.getClass(), "lastUsedDeckId", 149806587);
        setIntField(term56708, term56708.getClass(), "lastPlayMusicLevel", 2030509680);
        setIntField(term56708, term56708.getClass(), "lastEmoneyBrand", -927217294);
        term56971 = new Integer(-157082836);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term56971;
        callMethod(klass, "setCardId", argTypes, term56708, args);
    }

};


