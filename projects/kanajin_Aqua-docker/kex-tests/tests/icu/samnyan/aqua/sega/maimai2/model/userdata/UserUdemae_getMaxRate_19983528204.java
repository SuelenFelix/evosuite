package icu.samnyan.aqua.sega.maimai2.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai2.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;
import java.util.ArrayList;
import java.lang.Integer;

public class UserUdemae_getMaxRate_19983528204 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96657;

    public UserUdemae_getMaxRate_19983528204() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term96663 = new Long(1457594663983990440L);
        Integer term96726 = new Integer(1329150584);
        Integer term96728 = new Integer(-1825382367);
        Integer term96730 = new Integer(-1791371074);
        Integer term96732 = new Integer(-1151122332);
        ArrayList term96724 = new ArrayList();
        ((ArrayList) term96724).add(term96726);
        ((ArrayList) term96724).add(term96728);
        ((ArrayList) term96724).add(term96730);
        ((ArrayList) term96724).add(term96732);
        Integer term96738 = new Integer(953387911);
        ArrayList term96736 = new ArrayList();
        ((ArrayList) term96736).add(term96738);
        term96657 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserUdemae"));
        Object term96659 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term96661 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term96677 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term96678 = newInstance(Class.forName("java.time.LocalDate"));
        Object term96682 = newInstance(Class.forName("java.time.LocalTime"));
        Object term96687 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term96688 = newInstance(Class.forName("java.time.LocalDate"));
        Object term96692 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term96657, term96657.getClass(), "id", -9137168165760106798L);
        setLongField(term96659, term96659.getClass(), "id", 7708778616739137981L);
        setLongField(term96661, term96661.getClass(), "id", 8715204132761098696L);
        setField(term96661, term96661.getClass(), "extId", term96663);
        setField(term96661, term96661.getClass(), "luid", "cIMeTiVeEp");
        setIntField(term96678, term96678.getClass(), "year", 2018);
        setShortField(term96678, term96678.getClass(), "month", (short) 7);
        setShortField(term96678, term96678.getClass(), "day", (short) 24);
        setField(term96677, term96677.getClass(), "date", term96678);
        setByteField(term96682, term96682.getClass(), "hour", (byte) 8);
        setByteField(term96682, term96682.getClass(), "minute", (byte) 32);
        setByteField(term96682, term96682.getClass(), "second", (byte) 43);
        setIntField(term96682, term96682.getClass(), "nano", 490940025);
        setField(term96677, term96677.getClass(), "time", term96682);
        setField(term96661, term96661.getClass(), "registerTime", term96677);
        setIntField(term96688, term96688.getClass(), "year", 2018);
        setShortField(term96688, term96688.getClass(), "month", (short) 7);
        setShortField(term96688, term96688.getClass(), "day", (short) 6);
        setField(term96687, term96687.getClass(), "date", term96688);
        setByteField(term96692, term96692.getClass(), "hour", (byte) 6);
        setByteField(term96692, term96692.getClass(), "minute", (byte) 33);
        setByteField(term96692, term96692.getClass(), "second", (byte) 21);
        setIntField(term96692, term96692.getClass(), "nano", 484192339);
        setField(term96687, term96687.getClass(), "time", term96692);
        setField(term96661, term96661.getClass(), "accessTime", term96687);
        setField(term96659, term96659.getClass(), "card", term96661);
        setField(term96659, term96659.getClass(), "userName", "aUqkaiSINd");
        setIntField(term96659, term96659.getClass(), "isNetMember", -622942789);
        setIntField(term96659, term96659.getClass(), "iconId", -638909127);
        setIntField(term96659, term96659.getClass(), "plateId", -1583218821);
        setIntField(term96659, term96659.getClass(), "titleId", 66936045);
        setIntField(term96659, term96659.getClass(), "partnerId", -734520364);
        setIntField(term96659, term96659.getClass(), "frameId", -1309875787);
        setIntField(term96659, term96659.getClass(), "selectMapId", 123831044);
        setIntField(term96659, term96659.getClass(), "totalAwake", 1698388280);
        setIntField(term96659, term96659.getClass(), "gradeRating", -44060117);
        setIntField(term96659, term96659.getClass(), "musicRating", 1362804360);
        setIntField(term96659, term96659.getClass(), "playerRating", 1614080670);
        setIntField(term96659, term96659.getClass(), "highestRating", -757156022);
        setIntField(term96659, term96659.getClass(), "gradeRank", -711624128);
        setIntField(term96659, term96659.getClass(), "classRank", 1920273912);
        setIntField(term96659, term96659.getClass(), "courseRank", -1321346843);
        setField(term96659, term96659.getClass(), "charaSlot", term96724);
        setField(term96659, term96659.getClass(), "charaLockSlot", term96736);
        setLongField(term96659, term96659.getClass(), "contentBit", -7560086943976921411L);
        setIntField(term96659, term96659.getClass(), "playCount", -1682796364);
        setField(term96659, term96659.getClass(), "eventWatchedDate", "IVtVcsDYoX");
        setField(term96659, term96659.getClass(), "lastGameId", "GgQFLRdyzF");
        setField(term96659, term96659.getClass(), "lastRomVersion", "irKkxyVwDT");
        setField(term96659, term96659.getClass(), "lastDataVersion", "vCUIiQSkZO");
        setField(term96659, term96659.getClass(), "lastLoginDate", "oAVrawlRsA");
        setField(term96659, term96659.getClass(), "lastPlayDate", "jVdmaiSLFy");
        setIntField(term96659, term96659.getClass(), "lastPlayCredit", -1747539443);
        setIntField(term96659, term96659.getClass(), "lastPlayMode", 1907000901);
        setIntField(term96659, term96659.getClass(), "lastPlaceId", -1160333442);
        setField(term96659, term96659.getClass(), "lastPlaceName", "QySSrixSJt");
        setIntField(term96659, term96659.getClass(), "lastAllNetId", 104572719);
        setIntField(term96659, term96659.getClass(), "lastRegionId", 1999151227);
        setField(term96659, term96659.getClass(), "lastRegionName", "UgIqArPAat");
        setField(term96659, term96659.getClass(), "lastClientId", "cAfXSAOdaf");
        setField(term96659, term96659.getClass(), "lastCountryCode", "gFWxmEVAsk");
        setIntField(term96659, term96659.getClass(), "lastSelectEMoney", 288964365);
        setIntField(term96659, term96659.getClass(), "lastSelectTicket", -586935630);
        setIntField(term96659, term96659.getClass(), "lastSelectCourse", 833837720);
        setIntField(term96659, term96659.getClass(), "lastCountCourse", 640367895);
        setField(term96659, term96659.getClass(), "firstGameId", "LmtyEJAnHW");
        setField(term96659, term96659.getClass(), "firstRomVersion", "KPFNRywlFG");
        setField(term96659, term96659.getClass(), "firstDataVersion", "EeSPJPLqrn");
        setField(term96659, term96659.getClass(), "firstPlayDate", "ixVPsPApNw");
        setField(term96659, term96659.getClass(), "compatibleCmVersion", "xBABghJWNo");
        setField(term96659, term96659.getClass(), "dailyBonusDate", "NpTcCfwURe");
        setField(term96659, term96659.getClass(), "dailyCourseBonusDate", "TxkpqJJFUT");
        setField(term96659, term96659.getClass(), "lastPairLoginDate", "FYulmknfej");
        setField(term96659, term96659.getClass(), "lastTrialPlayDate", "eKQelJcJEF");
        setIntField(term96659, term96659.getClass(), "playVsCount", -1613119246);
        setIntField(term96659, term96659.getClass(), "playSyncCount", -580412864);
        setIntField(term96659, term96659.getClass(), "winCount", 1286437691);
        setIntField(term96659, term96659.getClass(), "helpCount", -447971579);
        setIntField(term96659, term96659.getClass(), "comboCount", -2040992903);
        setLongField(term96659, term96659.getClass(), "totalDeluxscore", 9199331845494156353L);
        setLongField(term96659, term96659.getClass(), "totalBasicDeluxscore", -5753568340370307157L);
        setLongField(term96659, term96659.getClass(), "totalAdvancedDeluxscore", -7036699446832430477L);
        setLongField(term96659, term96659.getClass(), "totalExpertDeluxscore", 4078914953725326519L);
        setLongField(term96659, term96659.getClass(), "totalMasterDeluxscore", 2204505325171318122L);
        setLongField(term96659, term96659.getClass(), "totalReMasterDeluxscore", 5648572465261242904L);
        setIntField(term96659, term96659.getClass(), "totalSync", -366879890);
        setIntField(term96659, term96659.getClass(), "totalBasicSync", 2127723603);
        setIntField(term96659, term96659.getClass(), "totalAdvancedSync", 1512218420);
        setIntField(term96659, term96659.getClass(), "totalExpertSync", 745526581);
        setIntField(term96659, term96659.getClass(), "totalMasterSync", -699594655);
        setIntField(term96659, term96659.getClass(), "totalReMasterSync", -1851012399);
        setLongField(term96659, term96659.getClass(), "totalAchievement", -6565717772503302541L);
        setLongField(term96659, term96659.getClass(), "totalBasicAchievement", 8565557338431532040L);
        setLongField(term96659, term96659.getClass(), "totalAdvancedAchievement", 6166105616036971710L);
        setLongField(term96659, term96659.getClass(), "totalExpertAchievement", -5620922687611709677L);
        setLongField(term96659, term96659.getClass(), "totalMasterAchievement", -2346105813386002114L);
        setLongField(term96659, term96659.getClass(), "totalReMasterAchievement", -8289034985880178543L);
        setLongField(term96659, term96659.getClass(), "playerOldRating", 2163887912849925332L);
        setLongField(term96659, term96659.getClass(), "playerNewRating", -4225761439324849295L);
        setIntField(term96659, term96659.getClass(), "banState", -116319790);
        setLongField(term96659, term96659.getClass(), "dateTime", 221832985952382123L);
        setField(term96657, term96657.getClass(), "user", term96659);
        setIntField(term96657, term96657.getClass(), "rate", -1988687324);
        setIntField(term96657, term96657.getClass(), "maxRate", -57909074);
        setIntField(term96657, term96657.getClass(), "classValue", 1592412);
        setIntField(term96657, term96657.getClass(), "maxClassValue", -743417086);
        setIntField(term96657, term96657.getClass(), "totalWinNum", 2040843352);
        setIntField(term96657, term96657.getClass(), "totalLoseNum", 1204883248);
        setIntField(term96657, term96657.getClass(), "maxWinNum", -388281703);
        setIntField(term96657, term96657.getClass(), "maxLoseNum", 565641932);
        setIntField(term96657, term96657.getClass(), "winNum", -648267047);
        setIntField(term96657, term96657.getClass(), "loseNum", -2094100197);
        setIntField(term96657, term96657.getClass(), "npcTotalWinNum", 1058557611);
        setIntField(term96657, term96657.getClass(), "npcTotalLoseNum", 43971669);
        setIntField(term96657, term96657.getClass(), "npcMaxWinNum", 1611498185);
        setIntField(term96657, term96657.getClass(), "npcMaxLoseNum", 2091252305);
        setIntField(term96657, term96657.getClass(), "npcWinNum", 263368957);
        setIntField(term96657, term96657.getClass(), "npcLoseNum", 1664066639);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserUdemae");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMaxRate", argTypes, term96657, args);
    }

};


