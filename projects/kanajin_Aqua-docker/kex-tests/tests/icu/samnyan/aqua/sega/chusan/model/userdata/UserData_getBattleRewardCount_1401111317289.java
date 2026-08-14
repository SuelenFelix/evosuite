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

public class UserData_getBattleRewardCount_1401111317289 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4218351;

    public UserData_getBattleRewardCount_1401111317289() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4218351 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term4218351, term4218351.getClass(), "id", 0L);
        setField(term4218351, term4218351.getClass(), "card", null);
        setField(term4218351, term4218351.getClass(), "userName", null);
        setIntField(term4218351, term4218351.getClass(), "level", 0);
        setIntField(term4218351, term4218351.getClass(), "reincarnationNum", 0);
        setField(term4218351, term4218351.getClass(), "exp", null);
        setLongField(term4218351, term4218351.getClass(), "point", 0L);
        setLongField(term4218351, term4218351.getClass(), "totalPoint", 0L);
        setIntField(term4218351, term4218351.getClass(), "playCount", 0);
        setIntField(term4218351, term4218351.getClass(), "multiPlayCount", 0);
        setIntField(term4218351, term4218351.getClass(), "playerRating", 0);
        setIntField(term4218351, term4218351.getClass(), "highestRating", 0);
        setIntField(term4218351, term4218351.getClass(), "nameplateId", 0);
        setIntField(term4218351, term4218351.getClass(), "frameId", 0);
        setIntField(term4218351, term4218351.getClass(), "characterId", 0);
        setIntField(term4218351, term4218351.getClass(), "trophyId", 0);
        setIntField(term4218351, term4218351.getClass(), "playedTutorialBit", 0);
        setIntField(term4218351, term4218351.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term4218351, term4218351.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term4218351, term4218351.getClass(), "totalMapNum", 0);
        setLongField(term4218351, term4218351.getClass(), "totalHiScore", 0L);
        setLongField(term4218351, term4218351.getClass(), "totalBasicHighScore", 0L);
        setLongField(term4218351, term4218351.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term4218351, term4218351.getClass(), "totalExpertHighScore", 0L);
        setLongField(term4218351, term4218351.getClass(), "totalMasterHighScore", 0L);
        setLongField(term4218351, term4218351.getClass(), "totalUltimaHighScore", 0L);
        setField(term4218351, term4218351.getClass(), "eventWatchedDate", null);
        setIntField(term4218351, term4218351.getClass(), "friendCount", 0);
        setField(term4218351, term4218351.getClass(), "firstGameId", null);
        setField(term4218351, term4218351.getClass(), "firstRomVersion", null);
        setField(term4218351, term4218351.getClass(), "firstDataVersion", null);
        setField(term4218351, term4218351.getClass(), "firstPlayDate", null);
        setField(term4218351, term4218351.getClass(), "lastGameId", null);
        setField(term4218351, term4218351.getClass(), "lastRomVersion", null);
        setField(term4218351, term4218351.getClass(), "lastDataVersion", null);
        setField(term4218351, term4218351.getClass(), "lastLoginDate", null);
        setField(term4218351, term4218351.getClass(), "lastPlayDate", null);
        setIntField(term4218351, term4218351.getClass(), "lastPlaceId", 0);
        setField(term4218351, term4218351.getClass(), "lastPlaceName", null);
        setField(term4218351, term4218351.getClass(), "lastRegionId", null);
        setField(term4218351, term4218351.getClass(), "lastRegionName", null);
        setField(term4218351, term4218351.getClass(), "lastAllNetId", null);
        setField(term4218351, term4218351.getClass(), "lastClientId", null);
        setField(term4218351, term4218351.getClass(), "lastCountryCode", null);
        setField(term4218351, term4218351.getClass(), "userNameEx", null);
        setField(term4218351, term4218351.getClass(), "compatibleCmVersion", null);
        setIntField(term4218351, term4218351.getClass(), "medal", 0);
        setIntField(term4218351, term4218351.getClass(), "mapIconId", 0);
        setIntField(term4218351, term4218351.getClass(), "voiceId", 0);
        setIntField(term4218351, term4218351.getClass(), "avatarWear", 0);
        setIntField(term4218351, term4218351.getClass(), "avatarHead", 0);
        setIntField(term4218351, term4218351.getClass(), "avatarFace", 0);
        setIntField(term4218351, term4218351.getClass(), "avatarSkin", 0);
        setIntField(term4218351, term4218351.getClass(), "avatarItem", 0);
        setIntField(term4218351, term4218351.getClass(), "avatarFront", 0);
        setIntField(term4218351, term4218351.getClass(), "avatarBack", 0);
        setIntField(term4218351, term4218351.getClass(), "classEmblemBase", 0);
        setIntField(term4218351, term4218351.getClass(), "classEmblemMedal", 0);
        setIntField(term4218351, term4218351.getClass(), "stockedGridCount", 0);
        setIntField(term4218351, term4218351.getClass(), "exMapLoopCount", 0);
        setIntField(term4218351, term4218351.getClass(), "netBattlePlayCount", 0);
        setIntField(term4218351, term4218351.getClass(), "netBattleWinCount", 0);
        setIntField(term4218351, term4218351.getClass(), "netBattleLoseCount", 0);
        setIntField(term4218351, term4218351.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term4218351, term4218351.getClass(), "charaIllustId", 0);
        setIntField(term4218351, term4218351.getClass(), "skillId", 0);
        setIntField(term4218351, term4218351.getClass(), "overPowerPoint", 0);
        setIntField(term4218351, term4218351.getClass(), "overPowerRate", 0);
        setIntField(term4218351, term4218351.getClass(), "overPowerLowerRank", 0);
        setIntField(term4218351, term4218351.getClass(), "avatarPoint", 0);
        setIntField(term4218351, term4218351.getClass(), "battleRankId", 0);
        setIntField(term4218351, term4218351.getClass(), "battleRankPoint", 0);
        setIntField(term4218351, term4218351.getClass(), "eliteRankPoint", 0);
        setIntField(term4218351, term4218351.getClass(), "netBattle1stCount", 0);
        setIntField(term4218351, term4218351.getClass(), "netBattle2ndCount", 0);
        setIntField(term4218351, term4218351.getClass(), "netBattle3rdCount", 0);
        setIntField(term4218351, term4218351.getClass(), "netBattle4thCount", 0);
        setIntField(term4218351, term4218351.getClass(), "netBattleCorrection", 0);
        setIntField(term4218351, term4218351.getClass(), "netBattleErrCnt", 0);
        setIntField(term4218351, term4218351.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term4218351, term4218351.getClass(), "battleRewardStatus", 0);
        setIntField(term4218351, term4218351.getClass(), "battleRewardIndex", 0);
        setIntField(term4218351, term4218351.getClass(), "battleRewardCount", 0);
        setIntField(term4218351, term4218351.getClass(), "ext1", 0);
        setIntField(term4218351, term4218351.getClass(), "ext2", 0);
        setIntField(term4218351, term4218351.getClass(), "ext3", 0);
        setIntField(term4218351, term4218351.getClass(), "ext4", 0);
        setIntField(term4218351, term4218351.getClass(), "ext5", 0);
        setIntField(term4218351, term4218351.getClass(), "ext6", 0);
        setIntField(term4218351, term4218351.getClass(), "ext7", 0);
        setIntField(term4218351, term4218351.getClass(), "ext8", 0);
        setIntField(term4218351, term4218351.getClass(), "ext9", 0);
        setIntField(term4218351, term4218351.getClass(), "ext10", 0);
        setField(term4218351, term4218351.getClass(), "extStr1", null);
        setField(term4218351, term4218351.getClass(), "extStr2", null);
        setLongField(term4218351, term4218351.getClass(), "extLong1", 0L);
        setLongField(term4218351, term4218351.getClass(), "extLong2", 0L);
        setField(term4218351, term4218351.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term4218351, term4218351.getClass(), "isNetBattleHost", false);
        setIntField(term4218351, term4218351.getClass(), "netBattleEndState", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBattleRewardCount", argTypes, term4218351, args);
    }

};


