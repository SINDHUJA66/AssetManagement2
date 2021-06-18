package com.asset.management.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asset.management.dao.AssetsDao;
import com.asset.management.entity.Assets;
	
	@Service
	public class AssetsServiceImpl implements AssetsService {
		  
		//List<Assets>list;
		@Autowired
		private AssetsDao assetsDao;
		public AssetsServiceImpl() { 
			//list=new ArrayList<>();
			//list.add(new Assets(1,"laptop",4999,"electronics"));
			//list.add(new Assets(2,"tab",4999,"electronics"));
			
			
		}
		
		@Override
		public List<Assets> getAsset() {
			return assetsDao.findAll();
		}

		@SuppressWarnings("deprecation")
		@Override
		public Assets getAssets(long assetsId) {
		 
		//	Assets c=null;
			//for(Assets assets:list) {
				//if(assets.getId()==assetsId) {
					//c=assets;
					//break;
		//		}
			//}
			return assetsDao.getOne(assetsId);
		}

		@Override
		public Assets addAssets(Assets assets) {
			assetsDao.save(assets);
		//	list.add(assets);
			return assets;
		}

		@Override
		public Assets updateAssets(Assets assets) {
			assetsDao.save(assets);
			//list.add(assets);
		//	list.forEach(e->{
			//	if (e.getId()==assets.getId()) {
				//	e.setName(assets.getName());
					//e.setPrice(assets.getPrice());
					//e.setCategory(assets.getCategory());
					
			//	}
			//});
			return assets;
		}

		@Override
		public void deleteAssets(long parseLong) {
			@SuppressWarnings("deprecation")
			Assets entity=assetsDao.getOne(parseLong);
			assetsDao.delete(entity);
			//list=this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
		
		}

		
		

		
	}


