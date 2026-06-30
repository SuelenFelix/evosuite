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

public class UserOption_setColorSide_106993758565 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term338952;
     Object term339254;

    public UserOption_setColorSide_106993758565() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term338958 = new Long(8453730687540121475L);
        term338952 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption"));
        Object term338954 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term338956 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term338972 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term338973 = newInstance(Class.forName("java.time.LocalDate"));
        Object term338977 = newInstance(Class.forName("java.time.LocalTime"));
        Object term338982 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term338983 = newInstance(Class.forName("java.time.LocalDate"));
        Object term338987 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term338952, term338952.getClass(), "id", 3069498341100141030L);
        setLongField(term338954, term338954.getClass(), "id", -9166252056003063634L);
        setLongField(term338956, term338956.getClass(), "id", -4738547562579370052L);
        setField(term338956, term338956.getClass(), "extId", term338958);
        setField(term338956, term338956.getClass(), "luid", "kPPIrkTgop");
        setIntField(term338973, term338973.getClass(), "year", 2023);
        setShortField(term338973, term338973.getClass(), "month", (short) 4);
        setShortField(term338973, term338973.getClass(), "day", (short) 27);
        setField(term338972, term338972.getClass(), "date", term338973);
        setByteField(term338977, term338977.getClass(), "hour", (byte) 8);
        setByteField(term338977, term338977.getClass(), "minute", (byte) 20);
        setByteField(term338977, term338977.getClass(), "second", (byte) 4);
        setIntField(term338977, term338977.getClass(), "nano", 953803286);
        setField(term338972, term338972.getClass(), "time", term338977);
        setField(term338956, term338956.getClass(), "registerTime", term338972);
        setIntField(term338983, term338983.getClass(), "year", 2013);
        setShortField(term338983, term338983.getClass(), "month", (short) 11);
        setShortField(term338983, term338983.getClass(), "day", (short) 9);
        setField(term338982, term338982.getClass(), "date", term338983);
        setByteField(term338987, term338987.getClass(), "hour", (byte) 22);
        setByteField(term338987, term338987.getClass(), "minute", (byte) 35);
        setByteField(term338987, term338987.getClass(), "second", (byte) 26);
        setIntField(term338987, term338987.getClass(), "nano", 558003682);
        setField(term338982, term338982.getClass(), "time", term338987);
        setField(term338956, term338956.getClass(), "accessTime", term338982);
        setField(term338954, term338954.getClass(), "card", term338956);
        setField(term338954, term338954.getClass(), "userName", "vvYOwvTBjZ");
        setIntField(term338954, term338954.getClass(), "level", 130745069);
        setIntField(term338954, term338954.getClass(), "reincarnationNum", -1919471489);
        setLongField(term338954, term338954.getClass(), "exp", -2715058030548080740L);
        setLongField(term338954, term338954.getClass(), "point", -616110382935726056L);
        setLongField(term338954, term338954.getClass(), "totalPoint", -5897631955328695887L);
        setIntField(term338954, term338954.getClass(), "playCount", 544759580);
        setIntField(term338954, term338954.getClass(), "jewelCount", 1197078678);
        setIntField(term338954, term338954.getClass(), "totalJewelCount", 473889669);
        setIntField(term338954, term338954.getClass(), "medalCount", -1674438948);
        setIntField(term338954, term338954.getClass(), "playerRating", -729833150);
        setIntField(term338954, term338954.getClass(), "highestRating", -134344624);
        setIntField(term338954, term338954.getClass(), "battlePoint", 1715936337);
        setIntField(term338954, term338954.getClass(), "bestBattlePoint", -1048852351);
        setIntField(term338954, term338954.getClass(), "overDamageBattlePoint", 1943512594);
        setBooleanField(term338954, term338954.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term338954, term338954.getClass(), "nameplateId", 1042164264);
        setIntField(term338954, term338954.getClass(), "trophyId", -2015710129);
        setIntField(term338954, term338954.getClass(), "cardId", 360782425);
        setIntField(term338954, term338954.getClass(), "characterId", 275854548);
        setIntField(term338954, term338954.getClass(), "characterVoiceNo", -1407954490);
        setIntField(term338954, term338954.getClass(), "tabSetting", 765186263);
        setIntField(term338954, term338954.getClass(), "tabSortSetting", 2141645226);
        setIntField(term338954, term338954.getClass(), "cardCategorySetting", 1391245502);
        setIntField(term338954, term338954.getClass(), "cardSortSetting", -427719081);
        setIntField(term338954, term338954.getClass(), "rivalScoreCategorySetting", -124387312);
        setIntField(term338954, term338954.getClass(), "playedTutorialBit", 2055675770);
        setIntField(term338954, term338954.getClass(), "firstTutorialCancelNum", 1223723655);
        setLongField(term338954, term338954.getClass(), "sumTechHighScore", -3306730779098212124L);
        setLongField(term338954, term338954.getClass(), "sumTechBasicHighScore", -866552190495430590L);
        setLongField(term338954, term338954.getClass(), "sumTechAdvancedHighScore", 9222728924954547930L);
        setLongField(term338954, term338954.getClass(), "sumTechExpertHighScore", 9008784592931400334L);
        setLongField(term338954, term338954.getClass(), "sumTechMasterHighScore", 8849725831916378694L);
        setLongField(term338954, term338954.getClass(), "sumTechLunaticHighScore", 399388396852521506L);
        setLongField(term338954, term338954.getClass(), "sumBattleHighScore", -9126582122136785904L);
        setLongField(term338954, term338954.getClass(), "sumBattleBasicHighScore", 8399455458072201598L);
        setLongField(term338954, term338954.getClass(), "sumBattleAdvancedHighScore", 2267490123850084089L);
        setLongField(term338954, term338954.getClass(), "sumBattleExpertHighScore", 759278174985887992L);
        setLongField(term338954, term338954.getClass(), "sumBattleMasterHighScore", 7591418810848065828L);
        setLongField(term338954, term338954.getClass(), "sumBattleLunaticHighScore", -8201914033453572640L);
        setField(term338954, term338954.getClass(), "eventWatchedDate", "lAnEiHlYIh");
        setField(term338954, term338954.getClass(), "cmEventWatchedDate", "KuWwjZHeTm");
        setField(term338954, term338954.getClass(), "firstGameId", "LENlSxUjDg");
        setField(term338954, term338954.getClass(), "firstRomVersion", "yldnBDacpa");
        setField(term338954, term338954.getClass(), "firstDataVersion", "AGfbWlyofr");
        setField(term338954, term338954.getClass(), "firstPlayDate", "ISKjoziNjj");
        setField(term338954, term338954.getClass(), "lastGameId", "cotlPkDaUP");
        setField(term338954, term338954.getClass(), "lastRomVersion", "vAoVUCsJby");
        setField(term338954, term338954.getClass(), "lastDataVersion", "YAqmYvJnDl");
        setField(term338954, term338954.getClass(), "compatibleCmVersion", "kKRBlRYevq");
        setField(term338954, term338954.getClass(), "lastPlayDate", "PgSgsDRXIc");
        setIntField(term338954, term338954.getClass(), "lastPlaceId", 831915664);
        setField(term338954, term338954.getClass(), "lastPlaceName", "CaCJWgomTD");
        setIntField(term338954, term338954.getClass(), "lastRegionId", 637683364);
        setField(term338954, term338954.getClass(), "lastRegionName", "WmeiNzxVXF");
        setIntField(term338954, term338954.getClass(), "lastAllNetId", 722470445);
        setField(term338954, term338954.getClass(), "lastClientId", "CjPeyBzsyO");
        setIntField(term338954, term338954.getClass(), "lastUsedDeckId", -1885225159);
        setIntField(term338954, term338954.getClass(), "lastPlayMusicLevel", -1815881485);
        setIntField(term338954, term338954.getClass(), "lastEmoneyBrand", 1382562999);
        setField(term338952, term338952.getClass(), "user", term338954);
        setIntField(term338952, term338952.getClass(), "optionSet", 2123421042);
        setIntField(term338952, term338952.getClass(), "speed", 316313675);
        setIntField(term338952, term338952.getClass(), "mirror", 1809519697);
        setIntField(term338952, term338952.getClass(), "judgeTiming", 511673876);
        setIntField(term338952, term338952.getClass(), "judgeAdjustment", -660039584);
        setIntField(term338952, term338952.getClass(), "abort", 534163694);
        setIntField(term338952, term338952.getClass(), "stealthField", -1165775729);
        setIntField(term338952, term338952.getClass(), "tapSound", -1565255255);
        setIntField(term338952, term338952.getClass(), "volGuide", -1850027557);
        setIntField(term338952, term338952.getClass(), "volAll", 1287595175);
        setIntField(term338952, term338952.getClass(), "volTap", -2080323668);
        setIntField(term338952, term338952.getClass(), "volCrTap", 1700990005);
        setIntField(term338952, term338952.getClass(), "volHold", 1658815292);
        setIntField(term338952, term338952.getClass(), "volSide", 1795451677);
        setIntField(term338952, term338952.getClass(), "volFlick", 1130749698);
        setIntField(term338952, term338952.getClass(), "volBell", -955461057);
        setIntField(term338952, term338952.getClass(), "volEnemy", 58358065);
        setIntField(term338952, term338952.getClass(), "volSkill", 705631540);
        setIntField(term338952, term338952.getClass(), "volDamage", -1675218741);
        setIntField(term338952, term338952.getClass(), "colorField", -1709888183);
        setIntField(term338952, term338952.getClass(), "colorLaneBright", -117439776);
        setIntField(term338952, term338952.getClass(), "colorWallBright", 1471944537);
        setIntField(term338952, term338952.getClass(), "colorLane", 1047217638);
        setIntField(term338952, term338952.getClass(), "colorSide", 1618491461);
        setIntField(term338952, term338952.getClass(), "effectDamage", -1725204654);
        setIntField(term338952, term338952.getClass(), "effectPos", 2107338015);
        setIntField(term338952, term338952.getClass(), "judgeDisp", 1176997851);
        setIntField(term338952, term338952.getClass(), "judgePos", -1537259704);
        setIntField(term338952, term338952.getClass(), "judgeBreak", -733074161);
        setIntField(term338952, term338952.getClass(), "judgeHit", 2050810379);
        setIntField(term338952, term338952.getClass(), "platinumBreakDisp", 2024170268);
        setIntField(term338952, term338952.getClass(), "judgeCriticalBreak", 938970749);
        setIntField(term338952, term338952.getClass(), "matching", -1096562684);
        setIntField(term338952, term338952.getClass(), "dispPlayerLv", 1044386731);
        setIntField(term338952, term338952.getClass(), "dispRating", 1756025229);
        setIntField(term338952, term338952.getClass(), "dispBP", 949470299);
        setIntField(term338952, term338952.getClass(), "headphone", 1459814829);
        term339254 = new Integer(-224788243);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term339254;
        callMethod(klass, "setColorSide", argTypes, term338952, args);
    }

};


