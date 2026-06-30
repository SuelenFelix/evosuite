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

public class UserData_setCompatibleCmVersion_1087276759113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70063;

    public UserData_setCompatibleCmVersion_1087276759113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term70067 = new Long(-7291742736502427077L);
        term70063 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term70065 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term70081 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term70082 = newInstance(Class.forName("java.time.LocalDate"));
        Object term70086 = newInstance(Class.forName("java.time.LocalTime"));
        Object term70091 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term70092 = newInstance(Class.forName("java.time.LocalDate"));
        Object term70096 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term70063, term70063.getClass(), "id", 1670347449784766585L);
        setLongField(term70065, term70065.getClass(), "id", -8326327936376570218L);
        setField(term70065, term70065.getClass(), "extId", term70067);
        setField(term70065, term70065.getClass(), "luid", "ivxMfASKCB");
        setIntField(term70082, term70082.getClass(), "year", 2022);
        setShortField(term70082, term70082.getClass(), "month", (short) 12);
        setShortField(term70082, term70082.getClass(), "day", (short) 22);
        setField(term70081, term70081.getClass(), "date", term70082);
        setByteField(term70086, term70086.getClass(), "hour", (byte) 18);
        setByteField(term70086, term70086.getClass(), "minute", (byte) 30);
        setByteField(term70086, term70086.getClass(), "second", (byte) 56);
        setIntField(term70086, term70086.getClass(), "nano", 111391416);
        setField(term70081, term70081.getClass(), "time", term70086);
        setField(term70065, term70065.getClass(), "registerTime", term70081);
        setIntField(term70092, term70092.getClass(), "year", 2019);
        setShortField(term70092, term70092.getClass(), "month", (short) 6);
        setShortField(term70092, term70092.getClass(), "day", (short) 22);
        setField(term70091, term70091.getClass(), "date", term70092);
        setByteField(term70096, term70096.getClass(), "hour", (byte) 9);
        setByteField(term70096, term70096.getClass(), "minute", (byte) 14);
        setByteField(term70096, term70096.getClass(), "second", (byte) 27);
        setIntField(term70096, term70096.getClass(), "nano", 124138657);
        setField(term70091, term70091.getClass(), "time", term70096);
        setField(term70065, term70065.getClass(), "accessTime", term70091);
        setField(term70063, term70063.getClass(), "card", term70065);
        setField(term70063, term70063.getClass(), "userName", "JbksMMXXzT");
        setIntField(term70063, term70063.getClass(), "level", 1029365631);
        setIntField(term70063, term70063.getClass(), "reincarnationNum", 833153549);
        setLongField(term70063, term70063.getClass(), "exp", 6004168776796799036L);
        setLongField(term70063, term70063.getClass(), "point", -2230737261489182178L);
        setLongField(term70063, term70063.getClass(), "totalPoint", -83935965733853204L);
        setIntField(term70063, term70063.getClass(), "playCount", 2031081082);
        setIntField(term70063, term70063.getClass(), "jewelCount", -595867565);
        setIntField(term70063, term70063.getClass(), "totalJewelCount", -1428615750);
        setIntField(term70063, term70063.getClass(), "medalCount", -247199850);
        setIntField(term70063, term70063.getClass(), "playerRating", 1369708580);
        setIntField(term70063, term70063.getClass(), "highestRating", -1943851319);
        setIntField(term70063, term70063.getClass(), "battlePoint", 1613470339);
        setIntField(term70063, term70063.getClass(), "bestBattlePoint", 764077315);
        setIntField(term70063, term70063.getClass(), "overDamageBattlePoint", -127465158);
        setBooleanField(term70063, term70063.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term70063, term70063.getClass(), "nameplateId", -727010746);
        setIntField(term70063, term70063.getClass(), "trophyId", 1698984137);
        setIntField(term70063, term70063.getClass(), "cardId", 1539842378);
        setIntField(term70063, term70063.getClass(), "characterId", -2020812793);
        setIntField(term70063, term70063.getClass(), "characterVoiceNo", 1214417682);
        setIntField(term70063, term70063.getClass(), "tabSetting", -492639935);
        setIntField(term70063, term70063.getClass(), "tabSortSetting", 1013003846);
        setIntField(term70063, term70063.getClass(), "cardCategorySetting", -1997703261);
        setIntField(term70063, term70063.getClass(), "cardSortSetting", 1822676900);
        setIntField(term70063, term70063.getClass(), "rivalScoreCategorySetting", 1807366282);
        setIntField(term70063, term70063.getClass(), "playedTutorialBit", 1352119826);
        setIntField(term70063, term70063.getClass(), "firstTutorialCancelNum", 399848636);
        setLongField(term70063, term70063.getClass(), "sumTechHighScore", -6117166524101089550L);
        setLongField(term70063, term70063.getClass(), "sumTechBasicHighScore", 2101866704361336078L);
        setLongField(term70063, term70063.getClass(), "sumTechAdvancedHighScore", 8493341625422825183L);
        setLongField(term70063, term70063.getClass(), "sumTechExpertHighScore", -2269414119814498738L);
        setLongField(term70063, term70063.getClass(), "sumTechMasterHighScore", -7494870343001402650L);
        setLongField(term70063, term70063.getClass(), "sumTechLunaticHighScore", -3147972350410788960L);
        setLongField(term70063, term70063.getClass(), "sumBattleHighScore", 4346251769204745723L);
        setLongField(term70063, term70063.getClass(), "sumBattleBasicHighScore", 5888936271160716455L);
        setLongField(term70063, term70063.getClass(), "sumBattleAdvancedHighScore", 8507610962194526217L);
        setLongField(term70063, term70063.getClass(), "sumBattleExpertHighScore", 4405633700704963930L);
        setLongField(term70063, term70063.getClass(), "sumBattleMasterHighScore", -2839037457841740486L);
        setLongField(term70063, term70063.getClass(), "sumBattleLunaticHighScore", -1513496915959494427L);
        setField(term70063, term70063.getClass(), "eventWatchedDate", "WHpoLWpffz");
        setField(term70063, term70063.getClass(), "cmEventWatchedDate", "axiXBkomuw");
        setField(term70063, term70063.getClass(), "firstGameId", "nhByIXwUpO");
        setField(term70063, term70063.getClass(), "firstRomVersion", "vVySvQZVok");
        setField(term70063, term70063.getClass(), "firstDataVersion", "fDVzkGiHev");
        setField(term70063, term70063.getClass(), "firstPlayDate", "CanAbWJNgt");
        setField(term70063, term70063.getClass(), "lastGameId", "tFRLUuSeUt");
        setField(term70063, term70063.getClass(), "lastRomVersion", "KcKxvbBAHa");
        setField(term70063, term70063.getClass(), "lastDataVersion", "NbFVXCPmxn");
        setField(term70063, term70063.getClass(), "compatibleCmVersion", "ovYlGvhKKO");
        setField(term70063, term70063.getClass(), "lastPlayDate", "JvoSiMCDAb");
        setIntField(term70063, term70063.getClass(), "lastPlaceId", -1577579504);
        setField(term70063, term70063.getClass(), "lastPlaceName", "JANJXHGMsv");
        setIntField(term70063, term70063.getClass(), "lastRegionId", -1664214126);
        setField(term70063, term70063.getClass(), "lastRegionName", "WVQqsFGJMw");
        setIntField(term70063, term70063.getClass(), "lastAllNetId", -124745318);
        setField(term70063, term70063.getClass(), "lastClientId", "TIPSlmidwP");
        setIntField(term70063, term70063.getClass(), "lastUsedDeckId", 885215896);
        setIntField(term70063, term70063.getClass(), "lastPlayMusicLevel", 1157850302);
        setIntField(term70063, term70063.getClass(), "lastEmoneyBrand", -1748801993);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "SRYeqWJJkR";
        callMethod(klass, "setCompatibleCmVersion", argTypes, term70063, args);
    }

};


