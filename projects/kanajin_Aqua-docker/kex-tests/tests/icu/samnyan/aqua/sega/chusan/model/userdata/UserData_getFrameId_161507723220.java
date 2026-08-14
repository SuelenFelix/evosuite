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

public class UserData_getFrameId_161507723220 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4213038;

    public UserData_getFrameId_161507723220() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4213038 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term4213038, term4213038.getClass(), "id", 0L);
        setField(term4213038, term4213038.getClass(), "card", null);
        setField(term4213038, term4213038.getClass(), "userName", null);
        setIntField(term4213038, term4213038.getClass(), "level", 0);
        setIntField(term4213038, term4213038.getClass(), "reincarnationNum", 0);
        setField(term4213038, term4213038.getClass(), "exp", null);
        setLongField(term4213038, term4213038.getClass(), "point", 0L);
        setLongField(term4213038, term4213038.getClass(), "totalPoint", 0L);
        setIntField(term4213038, term4213038.getClass(), "playCount", 0);
        setIntField(term4213038, term4213038.getClass(), "multiPlayCount", 0);
        setIntField(term4213038, term4213038.getClass(), "playerRating", 0);
        setIntField(term4213038, term4213038.getClass(), "highestRating", 0);
        setIntField(term4213038, term4213038.getClass(), "nameplateId", 0);
        setIntField(term4213038, term4213038.getClass(), "frameId", 0);
        setIntField(term4213038, term4213038.getClass(), "characterId", 0);
        setIntField(term4213038, term4213038.getClass(), "trophyId", 0);
        setIntField(term4213038, term4213038.getClass(), "playedTutorialBit", 0);
        setIntField(term4213038, term4213038.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term4213038, term4213038.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term4213038, term4213038.getClass(), "totalMapNum", 0);
        setLongField(term4213038, term4213038.getClass(), "totalHiScore", 0L);
        setLongField(term4213038, term4213038.getClass(), "totalBasicHighScore", 0L);
        setLongField(term4213038, term4213038.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term4213038, term4213038.getClass(), "totalExpertHighScore", 0L);
        setLongField(term4213038, term4213038.getClass(), "totalMasterHighScore", 0L);
        setLongField(term4213038, term4213038.getClass(), "totalUltimaHighScore", 0L);
        setField(term4213038, term4213038.getClass(), "eventWatchedDate", null);
        setIntField(term4213038, term4213038.getClass(), "friendCount", 0);
        setField(term4213038, term4213038.getClass(), "firstGameId", null);
        setField(term4213038, term4213038.getClass(), "firstRomVersion", null);
        setField(term4213038, term4213038.getClass(), "firstDataVersion", null);
        setField(term4213038, term4213038.getClass(), "firstPlayDate", null);
        setField(term4213038, term4213038.getClass(), "lastGameId", null);
        setField(term4213038, term4213038.getClass(), "lastRomVersion", null);
        setField(term4213038, term4213038.getClass(), "lastDataVersion", null);
        setField(term4213038, term4213038.getClass(), "lastLoginDate", null);
        setField(term4213038, term4213038.getClass(), "lastPlayDate", null);
        setIntField(term4213038, term4213038.getClass(), "lastPlaceId", 0);
        setField(term4213038, term4213038.getClass(), "lastPlaceName", null);
        setField(term4213038, term4213038.getClass(), "lastRegionId", null);
        setField(term4213038, term4213038.getClass(), "lastRegionName", null);
        setField(term4213038, term4213038.getClass(), "lastAllNetId", null);
        setField(term4213038, term4213038.getClass(), "lastClientId", null);
        setField(term4213038, term4213038.getClass(), "lastCountryCode", null);
        setField(term4213038, term4213038.getClass(), "userNameEx", null);
        setField(term4213038, term4213038.getClass(), "compatibleCmVersion", null);
        setIntField(term4213038, term4213038.getClass(), "medal", 0);
        setIntField(term4213038, term4213038.getClass(), "mapIconId", 0);
        setIntField(term4213038, term4213038.getClass(), "voiceId", 0);
        setIntField(term4213038, term4213038.getClass(), "avatarWear", 0);
        setIntField(term4213038, term4213038.getClass(), "avatarHead", 0);
        setIntField(term4213038, term4213038.getClass(), "avatarFace", 0);
        setIntField(term4213038, term4213038.getClass(), "avatarSkin", 0);
        setIntField(term4213038, term4213038.getClass(), "avatarItem", 0);
        setIntField(term4213038, term4213038.getClass(), "avatarFront", 0);
        setIntField(term4213038, term4213038.getClass(), "avatarBack", 0);
        setIntField(term4213038, term4213038.getClass(), "classEmblemBase", 0);
        setIntField(term4213038, term4213038.getClass(), "classEmblemMedal", 0);
        setIntField(term4213038, term4213038.getClass(), "stockedGridCount", 0);
        setIntField(term4213038, term4213038.getClass(), "exMapLoopCount", 0);
        setIntField(term4213038, term4213038.getClass(), "netBattlePlayCount", 0);
        setIntField(term4213038, term4213038.getClass(), "netBattleWinCount", 0);
        setIntField(term4213038, term4213038.getClass(), "netBattleLoseCount", 0);
        setIntField(term4213038, term4213038.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term4213038, term4213038.getClass(), "charaIllustId", 0);
        setIntField(term4213038, term4213038.getClass(), "skillId", 0);
        setIntField(term4213038, term4213038.getClass(), "overPowerPoint", 0);
        setIntField(term4213038, term4213038.getClass(), "overPowerRate", 0);
        setIntField(term4213038, term4213038.getClass(), "overPowerLowerRank", 0);
        setIntField(term4213038, term4213038.getClass(), "avatarPoint", 0);
        setIntField(term4213038, term4213038.getClass(), "battleRankId", 0);
        setIntField(term4213038, term4213038.getClass(), "battleRankPoint", 0);
        setIntField(term4213038, term4213038.getClass(), "eliteRankPoint", 0);
        setIntField(term4213038, term4213038.getClass(), "netBattle1stCount", 0);
        setIntField(term4213038, term4213038.getClass(), "netBattle2ndCount", 0);
        setIntField(term4213038, term4213038.getClass(), "netBattle3rdCount", 0);
        setIntField(term4213038, term4213038.getClass(), "netBattle4thCount", 0);
        setIntField(term4213038, term4213038.getClass(), "netBattleCorrection", 0);
        setIntField(term4213038, term4213038.getClass(), "netBattleErrCnt", 0);
        setIntField(term4213038, term4213038.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term4213038, term4213038.getClass(), "battleRewardStatus", 0);
        setIntField(term4213038, term4213038.getClass(), "battleRewardIndex", 0);
        setIntField(term4213038, term4213038.getClass(), "battleRewardCount", 0);
        setIntField(term4213038, term4213038.getClass(), "ext1", 0);
        setIntField(term4213038, term4213038.getClass(), "ext2", 0);
        setIntField(term4213038, term4213038.getClass(), "ext3", 0);
        setIntField(term4213038, term4213038.getClass(), "ext4", 0);
        setIntField(term4213038, term4213038.getClass(), "ext5", 0);
        setIntField(term4213038, term4213038.getClass(), "ext6", 0);
        setIntField(term4213038, term4213038.getClass(), "ext7", 0);
        setIntField(term4213038, term4213038.getClass(), "ext8", 0);
        setIntField(term4213038, term4213038.getClass(), "ext9", 0);
        setIntField(term4213038, term4213038.getClass(), "ext10", 0);
        setField(term4213038, term4213038.getClass(), "extStr1", null);
        setField(term4213038, term4213038.getClass(), "extStr2", null);
        setLongField(term4213038, term4213038.getClass(), "extLong1", 0L);
        setLongField(term4213038, term4213038.getClass(), "extLong2", 0L);
        setField(term4213038, term4213038.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term4213038, term4213038.getClass(), "isNetBattleHost", false);
        setIntField(term4213038, term4213038.getClass(), "netBattleEndState", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFrameId", argTypes, term4213038, args);
    }

};


