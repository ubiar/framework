package com.odoo.addons.partners.sevices;

import com.odoo.base.res.ResPartner;
import com.odoo.support.service.OSyncAdapter;
import com.odoo.support.service.OSyncService;

public class PartnersService extends OSyncService {

	public static final String TAG = PartnersService.class.getSimpleName();

	/*
	 * @Override public Service getService() { return this; }
	 * 
	 * @Override public void performSync(Context context, OUser user, Account
	 * account, Bundle extras, String authority, ContentProviderClient provider,
	 * SyncResult syncResult) { Log.v(TAG, "PartnersService:performSync()"); try
	 * { OSyncHelper sync = null; Intent intent = new Intent();
	 * intent.setAction(SyncFinishReceiver.SYNC_FINISH); ResPartner resPartner =
	 * new ResPartner(context); resPartner.setUser(user); sync =
	 * resPartner.getSyncHelper().syncDataLimit(30); if (sync.syncWithServer())
	 * { context.sendBroadcast(intent); }
	 * 
	 * } catch (Exception e) { e.printStackTrace(); } }
	 */

	@Override
	public OSyncAdapter getSyncAdapter() {
		return new OSyncAdapter(getApplicationContext(), new ResPartner(
				getApplicationContext()), true).syncDataLimit(50);
	}

}
