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

public class UserEventMusic_setId_139228092811 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term374018;
     Object term374302;

    public UserEventMusic_setId_139228092811() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term374024 = new Long(-1237494311441603673L);
        term374018 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserEventMusic"));
        Object term374020 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term374022 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term374038 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term374039 = newInstance(Class.forName("java.time.LocalDate"));
        Object term374043 = newInstance(Class.forName("java.time.LocalTime"));
        Object term374048 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term374049 = newInstance(Class.forName("java.time.LocalDate"));
        Object term374053 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term374018, term374018.getClass(), "id", -2979027339279078723L);
        setLongField(term374020, term374020.getClass(), "id", 6917609689454228209L);
        setLongField(term374022, term374022.getClass(), "id", -2515774943867461953L);
        setField(term374022, term374022.getClass(), "extId", term374024);
        setField(term374022, term374022.getClass(), "luid", "ZBwsjdwfcZ");
        setIntField(term374039, term374039.getClass(), "year", 2014);
        setShortField(term374039, term374039.getClass(), "month", (short) 4);
        setShortField(term374039, term374039.getClass(), "day", (short) 14);
        setField(term374038, term374038.getClass(), "date", term374039);
        setByteField(term374043, term374043.getClass(), "hour", (byte) 3);
        setByteField(term374043, term374043.getClass(), "minute", (byte) 45);
        setByteField(term374043, term374043.getClass(), "second", (byte) 11);
        setIntField(term374043, term374043.getClass(), "nano", 613551326);
        setField(term374038, term374038.getClass(), "time", term374043);
        setField(term374022, term374022.getClass(), "registerTime", term374038);
        setIntField(term374049, term374049.getClass(), "year", 2012);
        setShortField(term374049, term374049.getClass(), "month", (short) 10);
        setShortField(term374049, term374049.getClass(), "day", (short) 6);
        setField(term374048, term374048.getClass(), "date", term374049);
        setByteField(term374053, term374053.getClass(), "hour", (byte) 1);
        setByteField(term374053, term374053.getClass(), "minute", (byte) 53);
        setByteField(term374053, term374053.getClass(), "second", (byte) 43);
        setIntField(term374053, term374053.getClass(), "nano", 662627574);
        setField(term374048, term374048.getClass(), "time", term374053);
        setField(term374022, term374022.getClass(), "accessTime", term374048);
        setField(term374020, term374020.getClass(), "card", term374022);
        setField(term374020, term374020.getClass(), "userName", "FqIUPZQKtw");
        setIntField(term374020, term374020.getClass(), "level", -1767928007);
        setIntField(term374020, term374020.getClass(), "reincarnationNum", -1827132686);
        setLongField(term374020, term374020.getClass(), "exp", -2772746941500797496L);
        setLongField(term374020, term374020.getClass(), "point", 6159292131730060870L);
        setLongField(term374020, term374020.getClass(), "totalPoint", -7549852886008886254L);
        setIntField(term374020, term374020.getClass(), "playCount", -1852023574);
        setIntField(term374020, term374020.getClass(), "jewelCount", -112711946);
        setIntField(term374020, term374020.getClass(), "totalJewelCount", -1420056493);
        setIntField(term374020, term374020.getClass(), "medalCount", 371396356);
        setIntField(term374020, term374020.getClass(), "playerRating", 1647777639);
        setIntField(term374020, term374020.getClass(), "highestRating", -1165384749);
        setIntField(term374020, term374020.getClass(), "battlePoint", 735880408);
        setIntField(term374020, term374020.getClass(), "bestBattlePoint", -1788171195);
        setIntField(term374020, term374020.getClass(), "overDamageBattlePoint", 2109086871);
        setBooleanField(term374020, term374020.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term374020, term374020.getClass(), "nameplateId", 1000002698);
        setIntField(term374020, term374020.getClass(), "trophyId", -940318845);
        setIntField(term374020, term374020.getClass(), "cardId", 1059211751);
        setIntField(term374020, term374020.getClass(), "characterId", -1028101419);
        setIntField(term374020, term374020.getClass(), "characterVoiceNo", -1676444812);
        setIntField(term374020, term374020.getClass(), "tabSetting", -440878641);
        setIntField(term374020, term374020.getClass(), "tabSortSetting", -1242327723);
        setIntField(term374020, term374020.getClass(), "cardCategorySetting", -1397662551);
        setIntField(term374020, term374020.getClass(), "cardSortSetting", 621894464);
        setIntField(term374020, term374020.getClass(), "rivalScoreCategorySetting", 932060640);
        setIntField(term374020, term374020.getClass(), "playedTutorialBit", 1513736259);
        setIntField(term374020, term374020.getClass(), "firstTutorialCancelNum", 415094603);
        setLongField(term374020, term374020.getClass(), "sumTechHighScore", 1003203083925319622L);
        setLongField(term374020, term374020.getClass(), "sumTechBasicHighScore", -7865799460970807954L);
        setLongField(term374020, term374020.getClass(), "sumTechAdvancedHighScore", 4358035399316333672L);
        setLongField(term374020, term374020.getClass(), "sumTechExpertHighScore", 1401642337933471326L);
        setLongField(term374020, term374020.getClass(), "sumTechMasterHighScore", 5154855725711970681L);
        setLongField(term374020, term374020.getClass(), "sumTechLunaticHighScore", 4025544018010647117L);
        setLongField(term374020, term374020.getClass(), "sumBattleHighScore", 807878977770771461L);
        setLongField(term374020, term374020.getClass(), "sumBattleBasicHighScore", 6661356924664748500L);
        setLongField(term374020, term374020.getClass(), "sumBattleAdvancedHighScore", -2775122662752732481L);
        setLongField(term374020, term374020.getClass(), "sumBattleExpertHighScore", 5157865015714267448L);
        setLongField(term374020, term374020.getClass(), "sumBattleMasterHighScore", -4341863682577870301L);
        setLongField(term374020, term374020.getClass(), "sumBattleLunaticHighScore", 7561927288862303031L);
        setField(term374020, term374020.getClass(), "eventWatchedDate", "QEzXCFJyaD");
        setField(term374020, term374020.getClass(), "cmEventWatchedDate", "MMfSSDzqaq");
        setField(term374020, term374020.getClass(), "firstGameId", "kwiZbXSGpI");
        setField(term374020, term374020.getClass(), "firstRomVersion", "aFAywDDNnc");
        setField(term374020, term374020.getClass(), "firstDataVersion", "boAPrSbTkG");
        setField(term374020, term374020.getClass(), "firstPlayDate", "CHKiyIGmzv");
        setField(term374020, term374020.getClass(), "lastGameId", "erbOqSnPtH");
        setField(term374020, term374020.getClass(), "lastRomVersion", "bUrfDTGdWW");
        setField(term374020, term374020.getClass(), "lastDataVersion", "ZOuEgtmesa");
        setField(term374020, term374020.getClass(), "compatibleCmVersion", "KEGjtYjfap");
        setField(term374020, term374020.getClass(), "lastPlayDate", "orsNfoaJuM");
        setIntField(term374020, term374020.getClass(), "lastPlaceId", -109601494);
        setField(term374020, term374020.getClass(), "lastPlaceName", "wXrGkjBDmb");
        setIntField(term374020, term374020.getClass(), "lastRegionId", 216251043);
        setField(term374020, term374020.getClass(), "lastRegionName", "LmjMDcYNHm");
        setIntField(term374020, term374020.getClass(), "lastAllNetId", -243229696);
        setField(term374020, term374020.getClass(), "lastClientId", "vbcZGIvgux");
        setIntField(term374020, term374020.getClass(), "lastUsedDeckId", -826319515);
        setIntField(term374020, term374020.getClass(), "lastPlayMusicLevel", 235005549);
        setIntField(term374020, term374020.getClass(), "lastEmoneyBrand", 1988910643);
        setField(term374018, term374018.getClass(), "user", term374020);
        setIntField(term374018, term374018.getClass(), "eventId", -1062298098);
        setIntField(term374018, term374018.getClass(), "type", -36763107);
        setIntField(term374018, term374018.getClass(), "musicId", 1399771382);
        setIntField(term374018, term374018.getClass(), "level", -1053486466);
        setIntField(term374018, term374018.getClass(), "techScoreMax", 1403501043);
        setIntField(term374018, term374018.getClass(), "platinumScoreMax", 733395026);
        setField(term374018, term374018.getClass(), "techRecordDate", "ZVMjJRyNia");
        setBooleanField(term374018, term374018.getClass(), "isTechNewRecord", false);
        term374302 = new Long(7540971606955413214L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserEventMusic");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term374302;
        callMethod(klass, "setId", argTypes, term374018, args);
    }

};


