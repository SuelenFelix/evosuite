package icu.samnyan.aqua.sega.chusan.model.userdata;

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
import static icu.samnyan.aqua.sega.chusan.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UserData_getNetBattle4thCount_165198689282 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term283288;

    public UserData_getNetBattle4thCount_165198689282() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term283288 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term283288, term283288.getClass(), "id", 0L);
        setField(term283288, term283288.getClass(), "card", null);
        setField(term283288, term283288.getClass(), "userName", null);
        setIntField(term283288, term283288.getClass(), "level", 0);
        setIntField(term283288, term283288.getClass(), "reincarnationNum", 0);
        setField(term283288, term283288.getClass(), "exp", null);
        setLongField(term283288, term283288.getClass(), "point", 0L);
        setLongField(term283288, term283288.getClass(), "totalPoint", 0L);
        setIntField(term283288, term283288.getClass(), "playCount", 0);
        setIntField(term283288, term283288.getClass(), "multiPlayCount", 0);
        setIntField(term283288, term283288.getClass(), "playerRating", 0);
        setIntField(term283288, term283288.getClass(), "highestRating", 0);
        setIntField(term283288, term283288.getClass(), "nameplateId", 0);
        setIntField(term283288, term283288.getClass(), "frameId", 0);
        setIntField(term283288, term283288.getClass(), "characterId", 0);
        setIntField(term283288, term283288.getClass(), "trophyId", 0);
        setIntField(term283288, term283288.getClass(), "playedTutorialBit", 0);
        setIntField(term283288, term283288.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term283288, term283288.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term283288, term283288.getClass(), "totalMapNum", 0);
        setLongField(term283288, term283288.getClass(), "totalHiScore", 0L);
        setLongField(term283288, term283288.getClass(), "totalBasicHighScore", 0L);
        setLongField(term283288, term283288.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term283288, term283288.getClass(), "totalExpertHighScore", 0L);
        setLongField(term283288, term283288.getClass(), "totalMasterHighScore", 0L);
        setLongField(term283288, term283288.getClass(), "totalUltimaHighScore", 0L);
        setField(term283288, term283288.getClass(), "eventWatchedDate", null);
        setIntField(term283288, term283288.getClass(), "friendCount", 0);
        setField(term283288, term283288.getClass(), "firstGameId", null);
        setField(term283288, term283288.getClass(), "firstRomVersion", null);
        setField(term283288, term283288.getClass(), "firstDataVersion", null);
        setField(term283288, term283288.getClass(), "firstPlayDate", null);
        setField(term283288, term283288.getClass(), "lastGameId", null);
        setField(term283288, term283288.getClass(), "lastRomVersion", null);
        setField(term283288, term283288.getClass(), "lastDataVersion", null);
        setField(term283288, term283288.getClass(), "lastLoginDate", null);
        setField(term283288, term283288.getClass(), "lastPlayDate", null);
        setIntField(term283288, term283288.getClass(), "lastPlaceId", 0);
        setField(term283288, term283288.getClass(), "lastPlaceName", null);
        setField(term283288, term283288.getClass(), "lastRegionId", null);
        setField(term283288, term283288.getClass(), "lastRegionName", null);
        setField(term283288, term283288.getClass(), "lastAllNetId", null);
        setField(term283288, term283288.getClass(), "lastClientId", null);
        setField(term283288, term283288.getClass(), "lastCountryCode", null);
        setField(term283288, term283288.getClass(), "userNameEx", null);
        setField(term283288, term283288.getClass(), "compatibleCmVersion", null);
        setIntField(term283288, term283288.getClass(), "medal", 0);
        setIntField(term283288, term283288.getClass(), "mapIconId", 0);
        setIntField(term283288, term283288.getClass(), "voiceId", 0);
        setIntField(term283288, term283288.getClass(), "avatarWear", 0);
        setIntField(term283288, term283288.getClass(), "avatarHead", 0);
        setIntField(term283288, term283288.getClass(), "avatarFace", 0);
        setIntField(term283288, term283288.getClass(), "avatarSkin", 0);
        setIntField(term283288, term283288.getClass(), "avatarItem", 0);
        setIntField(term283288, term283288.getClass(), "avatarFront", 0);
        setIntField(term283288, term283288.getClass(), "avatarBack", 0);
        setIntField(term283288, term283288.getClass(), "classEmblemBase", 0);
        setIntField(term283288, term283288.getClass(), "classEmblemMedal", 0);
        setIntField(term283288, term283288.getClass(), "stockedGridCount", 0);
        setIntField(term283288, term283288.getClass(), "exMapLoopCount", 0);
        setIntField(term283288, term283288.getClass(), "netBattlePlayCount", 0);
        setIntField(term283288, term283288.getClass(), "netBattleWinCount", 0);
        setIntField(term283288, term283288.getClass(), "netBattleLoseCount", 0);
        setIntField(term283288, term283288.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term283288, term283288.getClass(), "charaIllustId", 0);
        setIntField(term283288, term283288.getClass(), "skillId", 0);
        setIntField(term283288, term283288.getClass(), "overPowerPoint", 0);
        setIntField(term283288, term283288.getClass(), "overPowerRate", 0);
        setIntField(term283288, term283288.getClass(), "overPowerLowerRank", 0);
        setIntField(term283288, term283288.getClass(), "avatarPoint", 0);
        setIntField(term283288, term283288.getClass(), "battleRankId", 0);
        setIntField(term283288, term283288.getClass(), "battleRankPoint", 0);
        setIntField(term283288, term283288.getClass(), "eliteRankPoint", 0);
        setIntField(term283288, term283288.getClass(), "netBattle1stCount", 0);
        setIntField(term283288, term283288.getClass(), "netBattle2ndCount", 0);
        setIntField(term283288, term283288.getClass(), "netBattle3rdCount", 0);
        setIntField(term283288, term283288.getClass(), "netBattle4thCount", 0);
        setIntField(term283288, term283288.getClass(), "netBattleCorrection", 0);
        setIntField(term283288, term283288.getClass(), "netBattleErrCnt", 0);
        setIntField(term283288, term283288.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term283288, term283288.getClass(), "battleRewardStatus", 0);
        setIntField(term283288, term283288.getClass(), "battleRewardIndex", 0);
        setIntField(term283288, term283288.getClass(), "battleRewardCount", 0);
        setIntField(term283288, term283288.getClass(), "ext1", 0);
        setIntField(term283288, term283288.getClass(), "ext2", 0);
        setIntField(term283288, term283288.getClass(), "ext3", 0);
        setIntField(term283288, term283288.getClass(), "ext4", 0);
        setIntField(term283288, term283288.getClass(), "ext5", 0);
        setIntField(term283288, term283288.getClass(), "ext6", 0);
        setIntField(term283288, term283288.getClass(), "ext7", 0);
        setIntField(term283288, term283288.getClass(), "ext8", 0);
        setIntField(term283288, term283288.getClass(), "ext9", 0);
        setIntField(term283288, term283288.getClass(), "ext10", 0);
        setField(term283288, term283288.getClass(), "extStr1", null);
        setField(term283288, term283288.getClass(), "extStr2", null);
        setLongField(term283288, term283288.getClass(), "extLong1", 0L);
        setLongField(term283288, term283288.getClass(), "extLong2", 0L);
        setField(term283288, term283288.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term283288, term283288.getClass(), "isNetBattleHost", false);
        setIntField(term283288, term283288.getClass(), "netBattleEndState", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNetBattle4thCount", argTypes, term283288, args);
    }

};


