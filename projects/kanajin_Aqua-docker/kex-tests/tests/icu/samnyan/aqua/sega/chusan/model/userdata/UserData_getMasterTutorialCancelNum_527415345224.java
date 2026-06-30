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

public class UserData_getMasterTutorialCancelNum_527415345224 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term278822;

    public UserData_getMasterTutorialCancelNum_527415345224() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term278822 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term278822, term278822.getClass(), "id", 0L);
        setField(term278822, term278822.getClass(), "card", null);
        setField(term278822, term278822.getClass(), "userName", null);
        setIntField(term278822, term278822.getClass(), "level", 0);
        setIntField(term278822, term278822.getClass(), "reincarnationNum", 0);
        setField(term278822, term278822.getClass(), "exp", null);
        setLongField(term278822, term278822.getClass(), "point", 0L);
        setLongField(term278822, term278822.getClass(), "totalPoint", 0L);
        setIntField(term278822, term278822.getClass(), "playCount", 0);
        setIntField(term278822, term278822.getClass(), "multiPlayCount", 0);
        setIntField(term278822, term278822.getClass(), "playerRating", 0);
        setIntField(term278822, term278822.getClass(), "highestRating", 0);
        setIntField(term278822, term278822.getClass(), "nameplateId", 0);
        setIntField(term278822, term278822.getClass(), "frameId", 0);
        setIntField(term278822, term278822.getClass(), "characterId", 0);
        setIntField(term278822, term278822.getClass(), "trophyId", 0);
        setIntField(term278822, term278822.getClass(), "playedTutorialBit", 0);
        setIntField(term278822, term278822.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term278822, term278822.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term278822, term278822.getClass(), "totalMapNum", 0);
        setLongField(term278822, term278822.getClass(), "totalHiScore", 0L);
        setLongField(term278822, term278822.getClass(), "totalBasicHighScore", 0L);
        setLongField(term278822, term278822.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term278822, term278822.getClass(), "totalExpertHighScore", 0L);
        setLongField(term278822, term278822.getClass(), "totalMasterHighScore", 0L);
        setLongField(term278822, term278822.getClass(), "totalUltimaHighScore", 0L);
        setField(term278822, term278822.getClass(), "eventWatchedDate", null);
        setIntField(term278822, term278822.getClass(), "friendCount", 0);
        setField(term278822, term278822.getClass(), "firstGameId", null);
        setField(term278822, term278822.getClass(), "firstRomVersion", null);
        setField(term278822, term278822.getClass(), "firstDataVersion", null);
        setField(term278822, term278822.getClass(), "firstPlayDate", null);
        setField(term278822, term278822.getClass(), "lastGameId", null);
        setField(term278822, term278822.getClass(), "lastRomVersion", null);
        setField(term278822, term278822.getClass(), "lastDataVersion", null);
        setField(term278822, term278822.getClass(), "lastLoginDate", null);
        setField(term278822, term278822.getClass(), "lastPlayDate", null);
        setIntField(term278822, term278822.getClass(), "lastPlaceId", 0);
        setField(term278822, term278822.getClass(), "lastPlaceName", null);
        setField(term278822, term278822.getClass(), "lastRegionId", null);
        setField(term278822, term278822.getClass(), "lastRegionName", null);
        setField(term278822, term278822.getClass(), "lastAllNetId", null);
        setField(term278822, term278822.getClass(), "lastClientId", null);
        setField(term278822, term278822.getClass(), "lastCountryCode", null);
        setField(term278822, term278822.getClass(), "userNameEx", null);
        setField(term278822, term278822.getClass(), "compatibleCmVersion", null);
        setIntField(term278822, term278822.getClass(), "medal", 0);
        setIntField(term278822, term278822.getClass(), "mapIconId", 0);
        setIntField(term278822, term278822.getClass(), "voiceId", 0);
        setIntField(term278822, term278822.getClass(), "avatarWear", 0);
        setIntField(term278822, term278822.getClass(), "avatarHead", 0);
        setIntField(term278822, term278822.getClass(), "avatarFace", 0);
        setIntField(term278822, term278822.getClass(), "avatarSkin", 0);
        setIntField(term278822, term278822.getClass(), "avatarItem", 0);
        setIntField(term278822, term278822.getClass(), "avatarFront", 0);
        setIntField(term278822, term278822.getClass(), "avatarBack", 0);
        setIntField(term278822, term278822.getClass(), "classEmblemBase", 0);
        setIntField(term278822, term278822.getClass(), "classEmblemMedal", 0);
        setIntField(term278822, term278822.getClass(), "stockedGridCount", 0);
        setIntField(term278822, term278822.getClass(), "exMapLoopCount", 0);
        setIntField(term278822, term278822.getClass(), "netBattlePlayCount", 0);
        setIntField(term278822, term278822.getClass(), "netBattleWinCount", 0);
        setIntField(term278822, term278822.getClass(), "netBattleLoseCount", 0);
        setIntField(term278822, term278822.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term278822, term278822.getClass(), "charaIllustId", 0);
        setIntField(term278822, term278822.getClass(), "skillId", 0);
        setIntField(term278822, term278822.getClass(), "overPowerPoint", 0);
        setIntField(term278822, term278822.getClass(), "overPowerRate", 0);
        setIntField(term278822, term278822.getClass(), "overPowerLowerRank", 0);
        setIntField(term278822, term278822.getClass(), "avatarPoint", 0);
        setIntField(term278822, term278822.getClass(), "battleRankId", 0);
        setIntField(term278822, term278822.getClass(), "battleRankPoint", 0);
        setIntField(term278822, term278822.getClass(), "eliteRankPoint", 0);
        setIntField(term278822, term278822.getClass(), "netBattle1stCount", 0);
        setIntField(term278822, term278822.getClass(), "netBattle2ndCount", 0);
        setIntField(term278822, term278822.getClass(), "netBattle3rdCount", 0);
        setIntField(term278822, term278822.getClass(), "netBattle4thCount", 0);
        setIntField(term278822, term278822.getClass(), "netBattleCorrection", 0);
        setIntField(term278822, term278822.getClass(), "netBattleErrCnt", 0);
        setIntField(term278822, term278822.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term278822, term278822.getClass(), "battleRewardStatus", 0);
        setIntField(term278822, term278822.getClass(), "battleRewardIndex", 0);
        setIntField(term278822, term278822.getClass(), "battleRewardCount", 0);
        setIntField(term278822, term278822.getClass(), "ext1", 0);
        setIntField(term278822, term278822.getClass(), "ext2", 0);
        setIntField(term278822, term278822.getClass(), "ext3", 0);
        setIntField(term278822, term278822.getClass(), "ext4", 0);
        setIntField(term278822, term278822.getClass(), "ext5", 0);
        setIntField(term278822, term278822.getClass(), "ext6", 0);
        setIntField(term278822, term278822.getClass(), "ext7", 0);
        setIntField(term278822, term278822.getClass(), "ext8", 0);
        setIntField(term278822, term278822.getClass(), "ext9", 0);
        setIntField(term278822, term278822.getClass(), "ext10", 0);
        setField(term278822, term278822.getClass(), "extStr1", null);
        setField(term278822, term278822.getClass(), "extStr2", null);
        setLongField(term278822, term278822.getClass(), "extLong1", 0L);
        setLongField(term278822, term278822.getClass(), "extLong2", 0L);
        setField(term278822, term278822.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term278822, term278822.getClass(), "isNetBattleHost", false);
        setIntField(term278822, term278822.getClass(), "netBattleEndState", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMasterTutorialCancelNum", argTypes, term278822, args);
    }

};


