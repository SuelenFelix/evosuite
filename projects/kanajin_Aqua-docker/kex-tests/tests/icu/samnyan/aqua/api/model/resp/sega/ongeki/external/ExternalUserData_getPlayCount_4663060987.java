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

public class ExternalUserData_getPlayCount_4663060987 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98922;

    public ExternalUserData_getPlayCount_4663060987() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term98922 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term98922, term98922.getClass(), "accessCode", "KaYErWMcJS");
        setField(term98922, term98922.getClass(), "userName", "BzVShvjOdM");
        setIntField(term98922, term98922.getClass(), "level", 588956417);
        setIntField(term98922, term98922.getClass(), "reincarnationNum", -1664696134);
        setLongField(term98922, term98922.getClass(), "exp", 3617115730171050714L);
        setLongField(term98922, term98922.getClass(), "point", 6497582195726114729L);
        setLongField(term98922, term98922.getClass(), "totalPoint", -3214348502059634465L);
        setIntField(term98922, term98922.getClass(), "playCount", -343992234);
        setIntField(term98922, term98922.getClass(), "jewelCount", -1209672009);
        setIntField(term98922, term98922.getClass(), "totalJewelCount", 1630634090);
        setIntField(term98922, term98922.getClass(), "medalCount", 795268454);
        setIntField(term98922, term98922.getClass(), "playerRating", 2071423306);
        setIntField(term98922, term98922.getClass(), "highestRating", 1381184751);
        setIntField(term98922, term98922.getClass(), "battlePoint", -119120055);
        setIntField(term98922, term98922.getClass(), "bestBattlePoint", -621482159);
        setIntField(term98922, term98922.getClass(), "overDamageBattlePoint", 1116774402);
        setIntField(term98922, term98922.getClass(), "nameplateId", -1021057583);
        setIntField(term98922, term98922.getClass(), "trophyId", -1675135419);
        setIntField(term98922, term98922.getClass(), "cardId", -192456802);
        setIntField(term98922, term98922.getClass(), "characterId", -1440344177);
        setIntField(term98922, term98922.getClass(), "tabSetting", 1854587192);
        setIntField(term98922, term98922.getClass(), "tabSortSetting", 552161283);
        setIntField(term98922, term98922.getClass(), "cardCategorySetting", -533505195);
        setIntField(term98922, term98922.getClass(), "cardSortSetting", -27748358);
        setIntField(term98922, term98922.getClass(), "rivalScoreCategorySetting", -449693352);
        setIntField(term98922, term98922.getClass(), "playedTutorialBit", 397657766);
        setIntField(term98922, term98922.getClass(), "firstTutorialCancelNum", -1913693541);
        setLongField(term98922, term98922.getClass(), "sumTechHighScore", -1505397547266367181L);
        setLongField(term98922, term98922.getClass(), "sumTechBasicHighScore", 2243354548018435980L);
        setLongField(term98922, term98922.getClass(), "sumTechAdvancedHighScore", 511935443347160104L);
        setLongField(term98922, term98922.getClass(), "sumTechExpertHighScore", 620320792988185737L);
        setLongField(term98922, term98922.getClass(), "sumTechMasterHighScore", -5794386543936842110L);
        setLongField(term98922, term98922.getClass(), "sumTechLunaticHighScore", 5545591278736168224L);
        setLongField(term98922, term98922.getClass(), "sumBattleHighScore", -5531478394066203067L);
        setLongField(term98922, term98922.getClass(), "sumBattleBasicHighScore", 7795568939646221859L);
        setLongField(term98922, term98922.getClass(), "sumBattleAdvancedHighScore", -5078431915868355065L);
        setLongField(term98922, term98922.getClass(), "sumBattleExpertHighScore", 6735596149732177421L);
        setLongField(term98922, term98922.getClass(), "sumBattleMasterHighScore", -4388921639678593613L);
        setLongField(term98922, term98922.getClass(), "sumBattleLunaticHighScore", -8100617172874490521L);
        setField(term98922, term98922.getClass(), "eventWatchedDate", "lHBEPYGKgl");
        setField(term98922, term98922.getClass(), "cmEventWatchedDate", "zgIExYJcqb");
        setField(term98922, term98922.getClass(), "firstGameId", "FXlVsFVqKL");
        setField(term98922, term98922.getClass(), "firstRomVersion", "UqUmOdicPq");
        setField(term98922, term98922.getClass(), "firstDataVersion", "eKdRNVXgWK");
        setField(term98922, term98922.getClass(), "firstPlayDate", "QbxkINpIeP");
        setField(term98922, term98922.getClass(), "lastGameId", "XpibzQSlpk");
        setField(term98922, term98922.getClass(), "lastRomVersion", "cCINHKehbG");
        setField(term98922, term98922.getClass(), "lastDataVersion", "ZYmkKKSqxV");
        setField(term98922, term98922.getClass(), "compatibleCmVersion", "pJRBgCaTos");
        setField(term98922, term98922.getClass(), "lastPlayDate", "NFjBLAbwyt");
        setIntField(term98922, term98922.getClass(), "lastPlaceId", -806910109);
        setField(term98922, term98922.getClass(), "lastPlaceName", "NLuipWkkqQ");
        setIntField(term98922, term98922.getClass(), "lastRegionId", 890021651);
        setField(term98922, term98922.getClass(), "lastRegionName", "lioOVZKDhE");
        setIntField(term98922, term98922.getClass(), "lastAllNetId", 656577433);
        setField(term98922, term98922.getClass(), "lastClientId", "sGMYhknZLN");
        setIntField(term98922, term98922.getClass(), "lastUsedDeckId", 1898583842);
        setIntField(term98922, term98922.getClass(), "lastPlayMusicLevel", 990480748);
        setIntField(term98922, term98922.getClass(), "lastEmoneyBrand", 1525940107);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayCount", argTypes, term98922, args);
    }

};


