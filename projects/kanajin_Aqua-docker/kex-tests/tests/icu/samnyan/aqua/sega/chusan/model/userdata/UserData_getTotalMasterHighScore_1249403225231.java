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

public class UserData_getTotalMasterHighScore_1249403225231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4213885;

    public UserData_getTotalMasterHighScore_1249403225231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4213885 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term4213885, term4213885.getClass(), "id", 0L);
        setField(term4213885, term4213885.getClass(), "card", null);
        setField(term4213885, term4213885.getClass(), "userName", null);
        setIntField(term4213885, term4213885.getClass(), "level", 0);
        setIntField(term4213885, term4213885.getClass(), "reincarnationNum", 0);
        setField(term4213885, term4213885.getClass(), "exp", null);
        setLongField(term4213885, term4213885.getClass(), "point", 0L);
        setLongField(term4213885, term4213885.getClass(), "totalPoint", 0L);
        setIntField(term4213885, term4213885.getClass(), "playCount", 0);
        setIntField(term4213885, term4213885.getClass(), "multiPlayCount", 0);
        setIntField(term4213885, term4213885.getClass(), "playerRating", 0);
        setIntField(term4213885, term4213885.getClass(), "highestRating", 0);
        setIntField(term4213885, term4213885.getClass(), "nameplateId", 0);
        setIntField(term4213885, term4213885.getClass(), "frameId", 0);
        setIntField(term4213885, term4213885.getClass(), "characterId", 0);
        setIntField(term4213885, term4213885.getClass(), "trophyId", 0);
        setIntField(term4213885, term4213885.getClass(), "playedTutorialBit", 0);
        setIntField(term4213885, term4213885.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term4213885, term4213885.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term4213885, term4213885.getClass(), "totalMapNum", 0);
        setLongField(term4213885, term4213885.getClass(), "totalHiScore", 0L);
        setLongField(term4213885, term4213885.getClass(), "totalBasicHighScore", 0L);
        setLongField(term4213885, term4213885.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term4213885, term4213885.getClass(), "totalExpertHighScore", 0L);
        setLongField(term4213885, term4213885.getClass(), "totalMasterHighScore", 0L);
        setLongField(term4213885, term4213885.getClass(), "totalUltimaHighScore", 0L);
        setField(term4213885, term4213885.getClass(), "eventWatchedDate", null);
        setIntField(term4213885, term4213885.getClass(), "friendCount", 0);
        setField(term4213885, term4213885.getClass(), "firstGameId", null);
        setField(term4213885, term4213885.getClass(), "firstRomVersion", null);
        setField(term4213885, term4213885.getClass(), "firstDataVersion", null);
        setField(term4213885, term4213885.getClass(), "firstPlayDate", null);
        setField(term4213885, term4213885.getClass(), "lastGameId", null);
        setField(term4213885, term4213885.getClass(), "lastRomVersion", null);
        setField(term4213885, term4213885.getClass(), "lastDataVersion", null);
        setField(term4213885, term4213885.getClass(), "lastLoginDate", null);
        setField(term4213885, term4213885.getClass(), "lastPlayDate", null);
        setIntField(term4213885, term4213885.getClass(), "lastPlaceId", 0);
        setField(term4213885, term4213885.getClass(), "lastPlaceName", null);
        setField(term4213885, term4213885.getClass(), "lastRegionId", null);
        setField(term4213885, term4213885.getClass(), "lastRegionName", null);
        setField(term4213885, term4213885.getClass(), "lastAllNetId", null);
        setField(term4213885, term4213885.getClass(), "lastClientId", null);
        setField(term4213885, term4213885.getClass(), "lastCountryCode", null);
        setField(term4213885, term4213885.getClass(), "userNameEx", null);
        setField(term4213885, term4213885.getClass(), "compatibleCmVersion", null);
        setIntField(term4213885, term4213885.getClass(), "medal", 0);
        setIntField(term4213885, term4213885.getClass(), "mapIconId", 0);
        setIntField(term4213885, term4213885.getClass(), "voiceId", 0);
        setIntField(term4213885, term4213885.getClass(), "avatarWear", 0);
        setIntField(term4213885, term4213885.getClass(), "avatarHead", 0);
        setIntField(term4213885, term4213885.getClass(), "avatarFace", 0);
        setIntField(term4213885, term4213885.getClass(), "avatarSkin", 0);
        setIntField(term4213885, term4213885.getClass(), "avatarItem", 0);
        setIntField(term4213885, term4213885.getClass(), "avatarFront", 0);
        setIntField(term4213885, term4213885.getClass(), "avatarBack", 0);
        setIntField(term4213885, term4213885.getClass(), "classEmblemBase", 0);
        setIntField(term4213885, term4213885.getClass(), "classEmblemMedal", 0);
        setIntField(term4213885, term4213885.getClass(), "stockedGridCount", 0);
        setIntField(term4213885, term4213885.getClass(), "exMapLoopCount", 0);
        setIntField(term4213885, term4213885.getClass(), "netBattlePlayCount", 0);
        setIntField(term4213885, term4213885.getClass(), "netBattleWinCount", 0);
        setIntField(term4213885, term4213885.getClass(), "netBattleLoseCount", 0);
        setIntField(term4213885, term4213885.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term4213885, term4213885.getClass(), "charaIllustId", 0);
        setIntField(term4213885, term4213885.getClass(), "skillId", 0);
        setIntField(term4213885, term4213885.getClass(), "overPowerPoint", 0);
        setIntField(term4213885, term4213885.getClass(), "overPowerRate", 0);
        setIntField(term4213885, term4213885.getClass(), "overPowerLowerRank", 0);
        setIntField(term4213885, term4213885.getClass(), "avatarPoint", 0);
        setIntField(term4213885, term4213885.getClass(), "battleRankId", 0);
        setIntField(term4213885, term4213885.getClass(), "battleRankPoint", 0);
        setIntField(term4213885, term4213885.getClass(), "eliteRankPoint", 0);
        setIntField(term4213885, term4213885.getClass(), "netBattle1stCount", 0);
        setIntField(term4213885, term4213885.getClass(), "netBattle2ndCount", 0);
        setIntField(term4213885, term4213885.getClass(), "netBattle3rdCount", 0);
        setIntField(term4213885, term4213885.getClass(), "netBattle4thCount", 0);
        setIntField(term4213885, term4213885.getClass(), "netBattleCorrection", 0);
        setIntField(term4213885, term4213885.getClass(), "netBattleErrCnt", 0);
        setIntField(term4213885, term4213885.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term4213885, term4213885.getClass(), "battleRewardStatus", 0);
        setIntField(term4213885, term4213885.getClass(), "battleRewardIndex", 0);
        setIntField(term4213885, term4213885.getClass(), "battleRewardCount", 0);
        setIntField(term4213885, term4213885.getClass(), "ext1", 0);
        setIntField(term4213885, term4213885.getClass(), "ext2", 0);
        setIntField(term4213885, term4213885.getClass(), "ext3", 0);
        setIntField(term4213885, term4213885.getClass(), "ext4", 0);
        setIntField(term4213885, term4213885.getClass(), "ext5", 0);
        setIntField(term4213885, term4213885.getClass(), "ext6", 0);
        setIntField(term4213885, term4213885.getClass(), "ext7", 0);
        setIntField(term4213885, term4213885.getClass(), "ext8", 0);
        setIntField(term4213885, term4213885.getClass(), "ext9", 0);
        setIntField(term4213885, term4213885.getClass(), "ext10", 0);
        setField(term4213885, term4213885.getClass(), "extStr1", null);
        setField(term4213885, term4213885.getClass(), "extStr2", null);
        setLongField(term4213885, term4213885.getClass(), "extLong1", 0L);
        setLongField(term4213885, term4213885.getClass(), "extLong2", 0L);
        setField(term4213885, term4213885.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term4213885, term4213885.getClass(), "isNetBattleHost", false);
        setIntField(term4213885, term4213885.getClass(), "netBattleEndState", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalMasterHighScore", argTypes, term4213885, args);
    }

};


