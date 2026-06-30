package icu.samnyan.aqua.api.model.resp.sega.ongeki.external;

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
import static icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ExternalUserData_setEventWatchedDate_200417606698 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term135076;

    public ExternalUserData_setEventWatchedDate_200417606698() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term135076 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term135076, term135076.getClass(), "accessCode", "xPPAfMTjqV");
        setField(term135076, term135076.getClass(), "userName", "knbmShxeRN");
        setIntField(term135076, term135076.getClass(), "level", -1031472177);
        setIntField(term135076, term135076.getClass(), "reincarnationNum", -224448129);
        setLongField(term135076, term135076.getClass(), "exp", 4387119921351812807L);
        setLongField(term135076, term135076.getClass(), "point", 1546790950105731656L);
        setLongField(term135076, term135076.getClass(), "totalPoint", -3383900775361671706L);
        setIntField(term135076, term135076.getClass(), "playCount", 1305140520);
        setIntField(term135076, term135076.getClass(), "jewelCount", 968289809);
        setIntField(term135076, term135076.getClass(), "totalJewelCount", 1049224991);
        setIntField(term135076, term135076.getClass(), "medalCount", 296137348);
        setIntField(term135076, term135076.getClass(), "playerRating", -800797703);
        setIntField(term135076, term135076.getClass(), "highestRating", 579538147);
        setIntField(term135076, term135076.getClass(), "battlePoint", -2014588714);
        setIntField(term135076, term135076.getClass(), "bestBattlePoint", 729569284);
        setIntField(term135076, term135076.getClass(), "overDamageBattlePoint", -1898286774);
        setIntField(term135076, term135076.getClass(), "nameplateId", 646539734);
        setIntField(term135076, term135076.getClass(), "trophyId", -784355914);
        setIntField(term135076, term135076.getClass(), "cardId", 1336145153);
        setIntField(term135076, term135076.getClass(), "characterId", -464435675);
        setIntField(term135076, term135076.getClass(), "tabSetting", 1485905340);
        setIntField(term135076, term135076.getClass(), "tabSortSetting", 425196031);
        setIntField(term135076, term135076.getClass(), "cardCategorySetting", 1869773501);
        setIntField(term135076, term135076.getClass(), "cardSortSetting", -330414887);
        setIntField(term135076, term135076.getClass(), "rivalScoreCategorySetting", -823314771);
        setIntField(term135076, term135076.getClass(), "playedTutorialBit", 2111310613);
        setIntField(term135076, term135076.getClass(), "firstTutorialCancelNum", 1565594512);
        setLongField(term135076, term135076.getClass(), "sumTechHighScore", -8912686303370809454L);
        setLongField(term135076, term135076.getClass(), "sumTechBasicHighScore", 3907851004606384287L);
        setLongField(term135076, term135076.getClass(), "sumTechAdvancedHighScore", -8670968748224500413L);
        setLongField(term135076, term135076.getClass(), "sumTechExpertHighScore", -7490813440780278545L);
        setLongField(term135076, term135076.getClass(), "sumTechMasterHighScore", -8098199791843727109L);
        setLongField(term135076, term135076.getClass(), "sumTechLunaticHighScore", 7919104703024634172L);
        setLongField(term135076, term135076.getClass(), "sumBattleHighScore", -4287512283734050191L);
        setLongField(term135076, term135076.getClass(), "sumBattleBasicHighScore", 7507963459385751739L);
        setLongField(term135076, term135076.getClass(), "sumBattleAdvancedHighScore", -2097562827254310797L);
        setLongField(term135076, term135076.getClass(), "sumBattleExpertHighScore", -843327797262841323L);
        setLongField(term135076, term135076.getClass(), "sumBattleMasterHighScore", 85945762587150890L);
        setLongField(term135076, term135076.getClass(), "sumBattleLunaticHighScore", -4306276439767014328L);
        setField(term135076, term135076.getClass(), "eventWatchedDate", "noEzqSZmJa");
        setField(term135076, term135076.getClass(), "cmEventWatchedDate", "QjWBVMiaya");
        setField(term135076, term135076.getClass(), "firstGameId", "QYeaKodgBd");
        setField(term135076, term135076.getClass(), "firstRomVersion", "GOQSwneqEb");
        setField(term135076, term135076.getClass(), "firstDataVersion", "JbqYSRevLD");
        setField(term135076, term135076.getClass(), "firstPlayDate", "HNSZguBZTH");
        setField(term135076, term135076.getClass(), "lastGameId", "PHooqPydcC");
        setField(term135076, term135076.getClass(), "lastRomVersion", "ZuPNUurPRd");
        setField(term135076, term135076.getClass(), "lastDataVersion", "CTUXadVRLh");
        setField(term135076, term135076.getClass(), "compatibleCmVersion", "KuPlFHMdCA");
        setField(term135076, term135076.getClass(), "lastPlayDate", "aOiLWtdwnn");
        setIntField(term135076, term135076.getClass(), "lastPlaceId", 275959108);
        setField(term135076, term135076.getClass(), "lastPlaceName", "muoAhEuvQF");
        setIntField(term135076, term135076.getClass(), "lastRegionId", 342294775);
        setField(term135076, term135076.getClass(), "lastRegionName", "oVXmxPjXjA");
        setIntField(term135076, term135076.getClass(), "lastAllNetId", -1502062752);
        setField(term135076, term135076.getClass(), "lastClientId", "iFaMRmXuCD");
        setIntField(term135076, term135076.getClass(), "lastUsedDeckId", -812214533);
        setIntField(term135076, term135076.getClass(), "lastPlayMusicLevel", -139654829);
        setIntField(term135076, term135076.getClass(), "lastEmoneyBrand", 1769958226);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "TYlCosvlAx";
        callMethod(klass, "setEventWatchedDate", argTypes, term135076, args);
    }

};


